package com.porgmun.martinajireckova.porgmun.activity;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.porgmun.martinajireckova.porgmun.R;
import com.porgmun.martinajireckova.porgmun.adapter.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class LunchFragment extends android.support.v4.app.Fragment {



    public LunchFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lunch, container, false);

        Button submit = (Button)rootView.findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Connection().execute();
            }
        });
        return rootView;
    }

    private class Connection extends AsyncTask {
        @Override
        protected Object doInBackground(Object...arg0){
            postData(getView());
            return null;
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);


    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



    public void postData(View v){

        EditText jmeno = (EditText) getView().findViewById(R.id.name_field);
        EditText allergy = (EditText) getView().findViewById(R.id.allergies_text);
        EditText specialtext = (EditText) getView().findViewById(R.id.special_text);
        RadioGroup lunchtext = (RadioGroup) getView().findViewById(R.id.lunch_group);
        RadioGroup veg = (RadioGroup) getView().findViewById(R.id.veg_group);
        String lunch = ((RadioButton)getView().findViewById(lunchtext.getCheckedRadioButtonId())).getText().toString();
        Log.i("test",lunch);
        String vegetarian = ((RadioButton)getView().findViewById(veg.getCheckedRadioButtonId())).getText().toString();
        Log.i("test",vegetarian);


        String url = getString(R.string.post_URL);
        String name = jmeno.getText().toString();
        Log.i("test",name);
        String allergies = allergy.getText().toString();
        Log.i("test",allergies);
        String special = specialtext.getText().toString();
        Log.i("test",special);
        HttpRequest request = new HttpRequest();
        try {
            String data = R.string.entry_name + "="+ URLEncoder.encode(name, "UTF-8") + "&" +
                    R.string.entry_lunch +"="+ URLEncoder.encode(lunch, "UTF-8") + "&" +
                    R.string.entry_vegetarian +"="+ URLEncoder.encode(vegetarian, "UTF-8") + "&" +
                    R.string.entry_allergies + "="+URLEncoder.encode(allergies, "UTF-8") + "&" +
                    R.string.entry_special +"="+ URLEncoder.encode(special,"UTF-8");

            String response = request.sendPost(url,data);
            Log.i("response",response);
        }
        catch(UnsupportedEncodingException e){
            Log.d("Unsupported exception", e.toString());
        }







    }
}