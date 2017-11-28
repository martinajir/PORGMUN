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


public class Voting extends Fragment {
    private FragmentActivity myContext;
    private String[] voting={"Vote by raising placards", "Vote by roll call", "Voting in Security Council"};
    private TextView odkaz_rules;

    public Voting() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_voting, container, false);

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


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(myContext, R.layout.list_item, voting);
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
                        fragmentTransaction.replace(R.id.container_body, new Vote_Placards());
                        fragmentTransaction.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Vote by raising placards");
                        break;

                    case 1:
                        Log.i("switch", "position 1");
                        FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                        fragmentTransaction2.replace(R.id.container_body, new Vote_Rollcall());
                        fragmentTransaction2.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Vote by roll call");
                        break;

                    case 2:
                        Log.i("switch", "position 2");
                        FragmentTransaction fragmentTransaction3 = fragmentManager.beginTransaction();
                        fragmentTransaction3.replace(R.id.container_body, new Vote_Security_Council());
                        fragmentTransaction3.commit();
                        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Voting Security Council");
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