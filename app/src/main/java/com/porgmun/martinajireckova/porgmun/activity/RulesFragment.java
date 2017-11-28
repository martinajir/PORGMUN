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
import android.support.v7.widget.CardView;

import com.porgmun.martinajireckova.porgmun.R;



public class RulesFragment extends Fragment{
    private CardView karta_1;
    private CardView karta_2;
    private CardView karta_3;
    private CardView karta_4;

    private FragmentActivity myContext;

    public RulesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);

        karta_1 = (CardView)rootView.findViewById(R.id.card_view_1);
        karta_2 =(CardView)rootView.findViewById(R.id.card_view_2);
        karta_3 = (CardView)rootView.findViewById(R.id.card_view_3);
        karta_4 = (CardView)rootView.findViewById(R.id.card_view_4);

        karta_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            FragmentManager fragmentManager = myContext.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, new PointsMotions());
            fragmentTransaction.commit();
            ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Points and Motions");
            }

        });

       karta_2.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {

               FragmentManager fragmentManager = myContext.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.container_body, new PartsDebate());
               fragmentTransaction.commit();
               ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Parts of the debate");
           }

       });

       karta_3.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {

               FragmentManager fragmentManager = myContext.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.container_body, new Amendments());
               fragmentTransaction.commit();
               ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Amendments");
           }

       });

       karta_4.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {

               FragmentManager fragmentManager = myContext.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.container_body, new Voting());
               fragmentTransaction.commit();
               ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Voting");
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