package com.porgmun.martinajireckova.porgmun.activity;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.porgmun.martinajireckova.porgmun.R;
import com.porgmun.martinajireckova.porgmun.adapter.JustifiedTextView;


public class PoI extends Fragment {

    private FragmentActivity myContext;
    private JustifiedTextView J;
    private JustifiedTextView J2;
    private String s1;
    private String s2;

    private TextView odkaz_rules;
    private TextView odkaz_points;

    public PoI() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_po_i, container, false);

        s1=getResources().getString(R.string.PoI1_popisek);
        s2=getResources().getString(R.string.PoI2_popisek);

        odkaz_rules=(TextView)rootView.findViewById(R.id.odkaz_rules);
        odkaz_points=(TextView)rootView.findViewById(R.id.odkaz_points);

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

        odkaz_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction5 = fragmentManager.beginTransaction();
                fragmentTransaction5.replace(R.id.container_body, new PointsMotions());
                fragmentTransaction5.commit();
                ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Points and Motions");
            }
        });


/*
        J = (JustifiedTextView)rootView.findViewById(R.id.jtext1);
        J.setText(s1);

        J2 = (JustifiedTextView)rootView.findViewById(R.id.jtext2);
        J2.setText(s2);
*/
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