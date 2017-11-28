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


public class PartsDebate extends Fragment {

    private FragmentActivity myContext;
    private String[] parts={"Closed Debate","Delegate's Speech", "Lobbying Session","Open Debate","Opening Speech"
    ,"Resolution"};

    private TextView odkaz_rules;

    public PartsDebate() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_parts_debate, container, false);

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


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(myContext, R.layout.list_item, parts);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();

                switch (position) {
                    case 0:
                        Log.i("switch", "position 0");
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.container_body, new ClosedDebate());
                        fragmentTransaction.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Closed Debate");
                        break;

                    case 1:
                        Log.i("switch", "position 1");
                        FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                        fragmentTransaction2.replace(R.id.container_body, new DelegateSpeech());
                        fragmentTransaction2.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Delegate's Speech");
                        break;

                    case 2:
                        Log.i("switch", "position 2");
                        FragmentTransaction fragmentTransaction3 = fragmentManager.beginTransaction();
                        fragmentTransaction3.replace(R.id.container_body, new LobbyingSession());
                        fragmentTransaction3.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Lobbying Session");
                        break;
                    case 3:
                        Log.i("switch", "position 3");
                        FragmentTransaction fragmentTransaction4 = fragmentManager.beginTransaction();
                        fragmentTransaction4.replace(R.id.container_body, new OpenDebate());
                        fragmentTransaction4.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Open Debate");
                        break;
                    case 4:
                        Log.i("switch", "position 4");
                        FragmentTransaction fragmentTransaction5 = fragmentManager.beginTransaction();
                        fragmentTransaction5.replace(R.id.container_body, new OpeningSpeech());
                        fragmentTransaction5.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Opening Speech");
                        break;


                    case 5:
                            Log.i("switch","position 6");
                            FragmentTransaction fragmentTransaction7 = fragmentManager.beginTransaction();
                            fragmentTransaction7.replace(R.id.container_body, new Resolution());
                            fragmentTransaction7.commit();
                            ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Resolution");
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