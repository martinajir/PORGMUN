package com.porgmun.martinajireckova.porgmun.activity;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.porgmun.martinajireckova.porgmun.R;


public class PointsMotions extends Fragment {

    private FragmentActivity myContext;
    private String[] motions={"Point of Information","Point of Order","Point of Personal Privilege",
    "Right of Reply", "Motion to move into closed debate", "Motion to move into voting procedure","Motion to move into unmoderated caucus"};
    private TextView odkaz_rules;

    public PointsMotions() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_points_motions, container, false);

        odkaz_rules=(TextView)rootView.findViewById(R.id.odkaz_rules);

        odkaz_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction5 = fragmentManager.beginTransaction();
                fragmentTransaction5.replace(R.id.container_body, new RulesFragment());
                fragmentTransaction5.commit();
                ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Rules");
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(myContext, R.layout.list_item, motions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a,View v,int position, long id ) {

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();

                switch(position){
                        case 0:Log.i("switch", "position 0");
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.container_body, new PoI());
                            fragmentTransaction.commit();
                                ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Point of Information");
                            break;

                        case 1:
                            Log.i("switch","position 1");
                            FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                            fragmentTransaction2.replace(R.id.container_body, new PoO());
                            fragmentTransaction2.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Point of Order");
                            break;

                        case 2:
                            Log.i("switch","position 2");
                            FragmentTransaction fragmentTransaction3 = fragmentManager.beginTransaction();
                            fragmentTransaction3.replace(R.id.container_body, new PoPP());
                            fragmentTransaction3.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Point of Personal Privilege");
                            break;
                        case 3:
                            Log.i("switch","position 3");
                            FragmentTransaction fragmentTransaction4 = fragmentManager.beginTransaction();
                            fragmentTransaction4.replace(R.id.container_body, new PoR());
                            fragmentTransaction4.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Right of Reply");
                            break;
                        case 4:
                            Log.i("switch","position 4");
                            FragmentTransaction fragmentTransaction5 = fragmentManager.beginTransaction();
                            fragmentTransaction5.replace(R.id.container_body, new Motion_Closed_Debate());
                            fragmentTransaction5.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Motion to move into closed debate");
                            break;
                        case 5:
                            Log.i("switch","position 5");
                            FragmentTransaction fragmentTransaction6 = fragmentManager.beginTransaction();
                            fragmentTransaction6.replace(R.id.container_body, new Motion_Voting());
                            fragmentTransaction6.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Motion to move into voting");
                            break;
                        case 6:
                            Log.i("switch","position 6");
                            FragmentTransaction fragmentTransaction7 = fragmentManager.beginTransaction();
                            fragmentTransaction7.replace(R.id.container_body, new Motion_Unmoderated_Caucus());
                            fragmentTransaction7.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Motion to move into unmoderated caucus");
                            break;

                    }

            }

        });

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}