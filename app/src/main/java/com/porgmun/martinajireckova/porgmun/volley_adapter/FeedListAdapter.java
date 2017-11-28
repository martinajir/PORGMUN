package com.porgmun.martinajireckova.porgmun.volley_adapter;


import com.porgmun.martinajireckova.porgmun.volley_app.FeedImageView;
import com.porgmun.martinajireckova.porgmun.R;
import com.porgmun.martinajireckova.porgmun.volley_app.AppController;
import com.porgmun.martinajireckova.porgmun.volley_data.FeedItem;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;


public class FeedListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<FeedItem> feedItems;
    public ImageLoader imageLoader= AppController.getInstance().getImageLoader();

    public FeedListAdapter(Activity activity, List<FeedItem> feedItems) {
        this.activity = activity;
        this.feedItems = feedItems;

        }

    @Override
    public int getCount() {
        return feedItems.size();
    }

    @Override
    public Object getItem(int location) {
        return feedItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.feed_item, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();

        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView timestamp = (TextView) convertView
                .findViewById(R.id.timestamp);
        TextView statusMsg = (TextView) convertView
                .findViewById(R.id.txtStatusMsg);
        TextView url = (TextView) convertView.findViewById(R.id.txtUrl);
        NetworkImageView profilePic = (NetworkImageView) convertView
                .findViewById(R.id.profilePic);
        FeedImageView feedImageView = (FeedImageView) convertView
                .findViewById(R.id.feedImage1);

        FeedItem item = feedItems.get(position);

        name.setText(item.getName());

        // Converting timestamp into x ago format
		/*CharSequence timeAgo = DateUtils.getRelativeTimeSpanString(
				Long.parseLong(item.getCreatedTime()),
				System.currentTimeMillis(), DateUtils.SECOND_IN_MILLIS);*/
        //timestamp.setText(timeAgo);
        String time = item.getCreatedTime();
        Log.i("time", time);
        StringBuilder finalTime = new StringBuilder();
        String month = new String();
        switch(time.charAt(6)){
            case '1':
                if (time.charAt(5)=='0')
                    month="leden";
                else
                    month="listopad";
                break;
            case '2':
                if(time.charAt(5)=='0')
                    month="únor";
                else
                    month="prosinec";
                break;
            case '3':
                month="březen";
                break;
            case '4':
                month="duben";
                break;
            case '5':
                month="květen";
                break;
            case '6':
                month = "červen";
                break;
            case '7':
                month = "červenec";
                break;
            case '8':
                month="srpen";
                break;
            case '9':
                month="září";
                break;
            case '0':
                month="říjen";
                break;
            default:
                month="měsíc";
                break;
        }
        finalTime.append(time.substring(8,10) + " " + month +" " + time.substring(0,4));
        timestamp.setText(finalTime);


        // Chcek for empty status message
        if (!TextUtils.isEmpty(item.getMessage())) {
            Log.i("message",item.getMessage());
            statusMsg.setText(item.getMessage());
            statusMsg.setVisibility(View.VISIBLE);
        } else {
            // status is empty, remove from view
            if(!TextUtils.isEmpty(item.getStory())){
                Log.i("story",item.getStory());
                statusMsg.setText(item.getStory());
                statusMsg.setVisibility(View.VISIBLE);
            }
            else
                statusMsg.setVisibility(View.GONE);
        }

        // Checking for null feed url
        if (item.getUrl() != null) {
            url.setText(Html.fromHtml("<a href=\"" + item.getUrl() + "\">"
                    + item.getUrl() + "</a> "));

            // Making url clickable
            url.setMovementMethod(LinkMovementMethod.getInstance());
            url.setVisibility(View.VISIBLE);
        } else {
            // url is null, remove from the view
            url.setVisibility(View.GONE);
        }

        // user profile pic
        profilePic.setImageUrl(item.getProfilePic(), imageLoader);

        // Feed image
        if (item.getImge() != null) {
            feedImageView.setImageUrl(item.getImge(), imageLoader);
            feedImageView.setVisibility(View.VISIBLE);
            feedImageView
                    .setResponseObserver(new FeedImageView.ResponseObserver() {
                        @Override
                        public void onError() {
                        }

                        @Override
                        public void onSuccess() {
                        }
                    });
        } else {
            feedImageView.setVisibility(View.GONE);
        }

        return convertView;
    }

}