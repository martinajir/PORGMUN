package com.porgmun.martinajireckova.porgmun.activity;

import com.porgmun.martinajireckova.porgmun.volley_adapter.FeedListAdapter;
import com.porgmun.martinajireckova.porgmun.volley_app.AppController;
import com.porgmun.martinajireckova.porgmun.volley_data.FeedItem;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.android.volley.Cache;
import com.android.volley.Cache.Entry;
import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;


import com.porgmun.martinajireckova.porgmun.R;
import com.facebook.FacebookSdk;

public class FeedActivity extends ActionBarActivity /*new*/implements FragmentDrawer.FragmentDrawerListener{

    private static final String TAG = FeedActivity.class.getSimpleName();
    private ListView listView;
    private FeedListAdapter listAdapter;
    private List<FeedItem> feedItems;
    private String URL_FEED = "https://graph.facebook.com/1443688759205321/feed?access_token=752597214849138|917fe0acdedbf5c65f78741abbe5b45f";

    //start new
    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    //end new

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.feed_activity_main);

        //start new
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener((FragmentDrawer.FragmentDrawerListener) this);
        //end new

/*
        String accessToken = new String("752597214849138|917fe0acdedbf5c65f78741abbe5b45f");
        String userId = new String("1443688759205321");
        String appId = new String("752597214849138");
        AccessToken a = new AccessToken(accessToken,
                appId, userId,null,null,null,null,null);
		// make the API call
        new GraphRequest(
                a,
                "/1443688759205321/feed",
                null,
                HttpMethod.GET,
                new GraphRequest.Callback() {
                    public void onCompleted(GraphResponse response) {
                        Log.i("response", response.toString());
            // handle the result
                    }
                }
        ).executeAsync();
*/


        listView = (ListView) findViewById(R.id.list);

        feedItems = new ArrayList<FeedItem>();

        listAdapter = new FeedListAdapter(this, feedItems);
        listView.setAdapter(listAdapter);

        // These two lines not needed,
        // just to get the look of facebook (changing background color & hiding the icon)
        //getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3b5998")));
       // getActionBar().setIcon(
               // new ColorDrawable(getResources().getColor(android.R.color.transparent)));

        // check for cached request
        Cache cache = AppController.getInstance().getRequestQueue().getCache();
        Entry entry = cache.get(URL_FEED);
        if (entry != null) {
            // fetch the data from cache
            try {
                String data = new String(entry.data, "UTF-8");
                try {
                    parseJsonFeed(new JSONObject(data));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        } else {
            // making fresh volley request and getting json
            JsonObjectRequest jsonReq = new JsonObjectRequest(Method.GET,
                    URL_FEED, null, new Response.Listener<JSONObject>() {

                @Override
                public void onResponse(JSONObject response) {
                    VolleyLog.d(TAG, "Response: " + response.toString());
                    if (response != null) {
                        parseJsonFeed(response);
                    }
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    VolleyLog.d(TAG, "Error: " + error.getMessage());
                }
            });

            // Adding request to volley request queue
            AppController.getInstance().addToRequestQueue(jsonReq);
        }

    }


    private void parseJsonFeed(JSONObject response) {
        try {
            JSONArray feedArray = response.getJSONArray("data");

            for (int i = 0; i < feedArray.length(); i++) {
                JSONObject feedObj = (JSONObject) feedArray.get(i);

                FeedItem item = new FeedItem();
                item.setId(feedObj.getString("id"));
                item.setName("PORGMUN");

                // Image might be null sometimes
                String image = feedObj.isNull("image") ? null : feedObj
                        .getString("image");
                item.setImge(image);

                //message
                String message = feedObj.isNull("message")? null : feedObj.getString("message");
                item.setMessage(message);

                // story
                String story = feedObj.isNull("story") ? null : feedObj.getString("story");
                item.setStory(story);

                if(feedObj.isNull("message")&&feedObj.isNull("story"))
                    item.setStory("PORGMUN added a new photo");

                item.setProfilePic("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/10246437_1443689445871919_2823562866715389769_n.png?oh=d8326dbbf9a13c7791ca4d2d2318a8fa&oe=58FF2DFB");
                item.setCreatedTime(feedObj.getString("created_time"));

                // url
                String postId = item.getId();

                item.setUrl("https://www.facebook.com/com.porgmun/posts/"+postId.substring(17));




                feedItems.add(item);
            }

            // notify data changes to list adapater
            listAdapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_feed, menu);
        return true;
    }

    //start new
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/



        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                Log.i("switch","home selected");
                MainActivity.count = 0;
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case 1:
                Log.i("switch", "committee selected");
                MainActivity.count = 1;
                Intent i2 = new Intent(this,MainActivity.class);
                startActivity(i2);
                break;
            case 2:
                Log.i("switch", "feedactivity starts");
                MainActivity.count = 2;
                Intent i3 = new Intent(this,MainActivity.class);
                startActivity(i3);
                break;
            case 3:
                Log.i("switch","rules start");
                MainActivity.count = 3;
                Intent i4 = new Intent(this,MainActivity.class);
                startActivity(i4);
                break;
            case 4:
                Log.i("switch","map starts");
                MainActivity.count = 4;
                Intent i5 = new Intent(this,MapsActivity.class);
                startActivity(i5);
                break;
            case 5:
                Log.i("switch","events start");
                MainActivity.count = 5;
                Intent i6 = new Intent(this,MainActivity.class);
                startActivity(i6);
                break;
            case 6:
                Log.i("switch","contact start");
                MainActivity.count = 6;
                Intent i9 = new Intent(this,MainActivity.class);
                startActivity(i9);
                break;
            default:
                break;
        }


        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}



