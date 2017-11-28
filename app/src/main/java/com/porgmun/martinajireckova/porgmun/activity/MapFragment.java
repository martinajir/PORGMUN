package com.porgmun.martinajireckova.porgmun.activity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.porgmun.martinajireckova.porgmun.R;
import static com.facebook.FacebookSdk.getApplicationContext;

public class MapFragment extends Fragment {
        public TextView odkazPORG;

    public MapFragment() {
        // Required empty public constructor
    }

@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(getApplicationContext(),MapsActivity.class);
        Log.i("activity", "start activity MapsActivity");
        startActivity(i);

        }

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        odkazPORG= (TextView)rootView.findViewById(R.id.link_porg);
        odkazPORG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW);
                Uri uri = Uri.parse("geo:50.024475,14.458982(Gymnázium Nový PORG)");
                intent.setData(uri);
                if (intent.resolveActivity(getActivity().getPackageManager())!=null)
                    startActivity(intent);
            }
        });

        return rootView;
        }


@Override
public void onAttach(Activity activity) {
        super.onAttach(activity);
        }

@Override
public void onDetach() {
        super.onDetach();
        }
        }
