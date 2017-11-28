package com.porgmun.martinajireckova.porgmun.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.model.Marker;
import com.porgmun.martinajireckova.porgmun.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends ActionBarActivity implements OnMapReadyCallback, FragmentDrawer.FragmentDrawerListener {

    private GoogleMap mMap;
    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener((FragmentDrawer.FragmentDrawerListener) this);

        tv = (TextView)findViewById(R.id.mapa_popis);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng porg = new LatLng(50.024435, 14.458796);

        mMap.addMarker(new MarkerOptions().position(porg).title("Gymnázium Nový PORG").snippet("Pod Krčským lesem 1381/4"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(porg));


        LatLng iris=new LatLng(50.0682673,14.471528199999966);
       mMap.addMarker(new MarkerOptions().position(iris).title("Iris Hotel Eden").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)).snippet("Vladivostocká 1539/2"));

        LatLng hlmp=new LatLng(50.08712490000001,14.41788740000004);
        mMap.addMarker(new MarkerOptions().position(hlmp).title("Prague City Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("Mariánské náměstí 2"));

        LatLng vaclav=new LatLng(50.0797819,14.429716900000017);
        mMap.addMarker(new MarkerOptions().position(vaclav).title("Statue of St. Wenceslas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("Václavské náměstí"));

        LatLng kanal=new LatLng(50.081259, 14.453885);
       // mMap.addMarker(new MarkerOptions().position(kanal).title("Slušnej Kanál").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng slunce=new LatLng(50.086635, 14.422782);
        //mMap.addMarker(new MarkerOptions().position(slunce).title("U Černého Slunce").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng rotlevu=new LatLng(50.086441, 14.422981);
       // mMap.addMarker(new MarkerOptions().position(rotlevu).title("U Rotlevů").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(porg,10);
        mMap.animateCamera(cameraUpdate);





        // Use a custom info window adapter to handle multiple lines of text in the
        // info window contents.
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

            @Override
            // Return null here, so that getInfoContents() is called next.
            public View getInfoWindow(Marker arg0) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                // Inflate the layouts for the info window, title and snippet.
                View infoWindow = getLayoutInflater().inflate(R.layout.custom_info_contents,
                        (FrameLayout) findViewById(R.id.map), false);

                TextView title = ((TextView) infoWindow.findViewById(R.id.title));
                title.setText(marker.getTitle());
                if (marker.getTitle().equals("Gymnázium Nový PORG"))
                    tv.setText(R.string.novy_porg_nazev);
                if (marker.getTitle().equals("Iris Hotel Eden"))
                    tv.setText(R.string.iris_hotel_nazev);
                if (marker.getTitle().equals("Prague City Hall"))
                    tv.setText(R.string.prague_city_hall_nazev);
                if (marker.getTitle().equals("Statue of St. Wenceslas"))
                    tv.setText(R.string.statue_nazev);

                TextView snippet = ((TextView) infoWindow.findViewById(R.id.snippet));
                snippet.setText(marker.getSnippet());

                return infoWindow;
            }
        });

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
                Log.i("switch", "home selected");
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
