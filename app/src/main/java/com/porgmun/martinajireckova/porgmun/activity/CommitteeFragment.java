package com.porgmun.martinajireckova.porgmun.activity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.porgmun.martinajireckova.porgmun.R;

import org.w3c.dom.Text;


public class CommitteeFragment extends Fragment {


    private CardView karta_0;
    private CardView karta_1;
    private CardView karta_2;
    private CardView karta_3;
    private CardView karta_4;
    private CardView karta_5;
    private CardView karta_6;
    private CardView karta_7;
    private CardView karta_8;
    private CardView karta_9;
    private CardView karta_10;
    private CardView karta_11;

    private TextView text_bottom_0;
    private TextView text_bottom;
    private TextView text_bottom1_2;
    private TextView text_bottom1_3;
    private TextView text_bottom2;
    private TextView text_bottom2_2;
    private TextView text_bottom2_3;
    private TextView text_bottom3;
    private TextView text_bottom3_2;
    private TextView text_bottom3_3;
    private TextView text_bottom4;
    private TextView text_bottom4_2;
    private TextView text_bottom4_3;
    private TextView text_bottom4_4;
    private TextView text_bottom5;
    private TextView text_bottom5_2;
    private TextView text_bottom5_3;
    private TextView text_bottom6;
    private TextView text_bottom6_2;
    private TextView text_bottom6_3;
    private TextView text_bottom7;
    private TextView text_bottom7_2;
    private TextView text_bottom7_3;
    private TextView text_bottom8;
    private TextView text_bottom8_2;
    private TextView text_bottom8_3;
    private TextView text_bottom9;
    private TextView text_bottom9_2;
    private TextView text_bottom9_3;
    private TextView text_bottom10;
    private TextView text_bottom10_2;
    private TextView text_bottom10_3;
    private TextView text_bottom11;
    private TextView text_bottom11_2;
    private TextView text_bottom11_3;

    private ImageView sipka0;
    private ImageView sipka1;
    private ImageView sipka2;
    private ImageView sipka3;
    private ImageView sipka4;
    private ImageView sipka5;
    private ImageView sipka6;
    private ImageView sipka7;
    private ImageView sipka8;
    private ImageView sipka9;
    private ImageView sipka10;
    private ImageView sipka11;


    public CommitteeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_committees, container, false);

        karta_0=(CardView)rootView.findViewById(R.id.card_view_0);
        text_bottom_0=(TextView)rootView.findViewById(R.id.text_bottom_0);
        text_bottom_0.setHeight(0);

        karta_1=(CardView)rootView.findViewById(R.id.card_view_1);
        text_bottom=(TextView)rootView.findViewById(R.id.text_bottom);
        text_bottom1_2=(TextView)rootView.findViewById(R.id.text_bottom1_2);
        text_bottom1_3=(TextView)rootView.findViewById(R.id.text_bottom1_3);
        text_bottom.setHeight(0);
        text_bottom1_2.setHeight(0);
        text_bottom1_3.setHeight(0);

        karta_2=(CardView)rootView.findViewById(R.id.card_view_2);
        text_bottom2=(TextView)rootView.findViewById(R.id.text_bottom2);
        text_bottom2.setHeight(0);
        text_bottom2_2=(TextView)rootView.findViewById(R.id.text_bottom2_2);
        text_bottom2_2.setHeight(0);
        text_bottom2_3=(TextView)rootView.findViewById(R.id.text_bottom2_3);
        text_bottom2_3.setHeight(0);

        karta_3=(CardView)rootView.findViewById(R.id.card_view_3);
        text_bottom3=(TextView)rootView.findViewById(R.id.text_bottom3);
        text_bottom3.setHeight(0);
        text_bottom3_2=(TextView)rootView.findViewById(R.id.text_bottom3_2);
        text_bottom3_2.setHeight(0);
        text_bottom3_3=(TextView)rootView.findViewById(R.id.text_bottom3_3);
        text_bottom3_3.setHeight(0);

        karta_4=(CardView)rootView.findViewById(R.id.card_view_4);
        text_bottom4=(TextView)rootView.findViewById(R.id.text_bottom4);
        text_bottom4.setHeight(0);
        text_bottom4_2=(TextView)rootView.findViewById(R.id.text_bottom4_2);
        text_bottom4_2.setHeight(0);
        text_bottom4_3=(TextView)rootView.findViewById(R.id.text_bottom4_3);
        text_bottom4_3.setHeight(0);
        text_bottom4_4=(TextView)rootView.findViewById(R.id.text_bottom4_4);
        text_bottom4_4.setHeight(0);



        karta_5=(CardView)rootView.findViewById(R.id.card_view_5);
        text_bottom5=(TextView)rootView.findViewById(R.id.text_bottom5);
        text_bottom5.setHeight(0);
        text_bottom5_2=(TextView)rootView.findViewById(R.id.text_bottom5_2);
        text_bottom5_2.setHeight(0);
        text_bottom5_3=(TextView)rootView.findViewById(R.id.text_bottom5_3);
        text_bottom5_3.setHeight(0);

        karta_6=(CardView)rootView.findViewById(R.id.card_view_6);
        text_bottom6=(TextView)rootView.findViewById(R.id.text_bottom6);
        text_bottom6_2=(TextView)rootView.findViewById(R.id.text_bottom6_2);
        text_bottom6_3=(TextView)rootView.findViewById(R.id.text_bottom6_3);
        text_bottom6.setHeight(0);
        text_bottom6_2.setHeight(0);
        text_bottom6_3.setHeight(0);

        karta_7=(CardView)rootView.findViewById(R.id.card_view_7);
        text_bottom7=(TextView)rootView.findViewById(R.id.text_bottom7);
        text_bottom7.setHeight(0);
        text_bottom7_2=(TextView)rootView.findViewById(R.id.text_bottom7_2);
        text_bottom7_2.setHeight(0);
        text_bottom7_3=(TextView)rootView.findViewById(R.id.text_bottom7_3);
        text_bottom7_3.setHeight(0);

        karta_8=(CardView)rootView.findViewById(R.id.card_view_8);
        text_bottom8=(TextView)rootView.findViewById(R.id.text_bottom8);
        text_bottom8.setHeight(0);
        text_bottom8_2=(TextView)rootView.findViewById(R.id.text_bottom8_2);
        text_bottom8_2.setHeight(0);
        text_bottom8_3=(TextView)rootView.findViewById(R.id.text_bottom8_3);
        text_bottom8_3.setHeight(0);

        karta_9=(CardView)rootView.findViewById(R.id.card_view_9);
        text_bottom9=(TextView)rootView.findViewById(R.id.text_bottom9);
        text_bottom9.setHeight(0);
        text_bottom9_2=(TextView)rootView.findViewById(R.id.text_bottom9_2);
        text_bottom9_2.setHeight(0);
        text_bottom9_3=(TextView)rootView.findViewById(R.id.text_bottom9_3);
        text_bottom9_3.setHeight(0);

        karta_10=(CardView)rootView.findViewById(R.id.card_view_10);
        text_bottom10=(TextView)rootView.findViewById(R.id.text_bottom10);
        text_bottom10.setHeight(0);
        text_bottom10_2=(TextView)rootView.findViewById(R.id.text_bottom10_2);
        text_bottom10_2.setHeight(0);
        text_bottom10_3=(TextView)rootView.findViewById(R.id.text_bottom10_3);
        text_bottom10_3.setHeight(0);

        karta_11=(CardView)rootView.findViewById(R.id.card_view_11);
        text_bottom11=(TextView)rootView.findViewById(R.id.text_bottom11);
        text_bottom11.setHeight(0);
        text_bottom11_2=(TextView)rootView.findViewById(R.id.text_bottom11_2);
        text_bottom11_2.setHeight(0);


        sipka0=(ImageView)rootView.findViewById(R.id.sipka0);
        sipka1=(ImageView)rootView.findViewById(R.id.sipka1);
        sipka2=(ImageView)rootView.findViewById(R.id.sipka2);
        sipka3=(ImageView)rootView.findViewById(R.id.sipka3);
        sipka4=(ImageView)rootView.findViewById(R.id.sipka4);
        sipka5=(ImageView)rootView.findViewById(R.id.sipka5);
        sipka6=(ImageView)rootView.findViewById(R.id.sipka6);
        sipka7=(ImageView)rootView.findViewById(R.id.sipka7);
        sipka8=(ImageView)rootView.findViewById(R.id.sipka8);
        sipka9=(ImageView)rootView.findViewById(R.id.sipka9);
        sipka10=(ImageView)rootView.findViewById(R.id.sipka10);
        sipka11=(ImageView)rootView.findViewById(R.id.sipka11);

        int textHeightnahore = 120;
        int textHeightnahore_dlouhy=200;
        int textHeightnahore_jeste_delsi=250;
        final int textHeightdole = 50;
        final float scale = getContext().getResources().getDisplayMetrics().density;
        final int textHeightDPInahore = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, textHeightnahore, getContext().getResources().getDisplayMetrics());
        final int textHeightDPIdole = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, textHeightdole, getContext().getResources().getDisplayMetrics());
        final int textHeightDPInahore_dlouhy = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, textHeightnahore_dlouhy, getContext().getResources().getDisplayMetrics());
        final int textHeightDPInahore_jeste_delsi = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, textHeightnahore_jeste_delsi, getContext().getResources().getDisplayMetrics());



        karta_0.setOnClickListener(new View.OnClickListener() {
            int count = 0;

            @Override
            public void onClick(View v) {
                if (count == 0) {

                    text_bottom_0.setHeight(textHeightDPInahore_jeste_delsi);

                    count = 1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka0.startAnimation(rotate);

                } else {
                    text_bottom_0.setHeight(0);

                    count = 0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka0.startAnimation(rotateBack);
                }
            }
        });


        karta_1.setOnClickListener(new View.OnClickListener() {
            int count = 0;

            @Override
            public void onClick(View v) {
                if (count == 0) {

                    text_bottom.setHeight(textHeightDPInahore);
                    text_bottom1_2.setHeight(textHeightDPIdole);
                    text_bottom1_3.setHeight(textHeightDPIdole);
                    count = 1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka1.startAnimation(rotate);

                } else {
                    text_bottom.setHeight(0);
                    text_bottom1_2.setHeight(0);
                    text_bottom1_3.setHeight(0);
                    count = 0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka1.startAnimation(rotateBack);
                }
            }
        });

        text_bottom1_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.sc_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        text_bottom1_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.sc_rules_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


        karta_2.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom2.setHeight(textHeightDPInahore_dlouhy);
                    text_bottom2_2.setHeight(textHeightDPIdole);
                    text_bottom2_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka2.startAnimation(rotate);

                }
                else{
                    text_bottom2.setHeight(0);
                    text_bottom2_2.setHeight(0);
                    text_bottom2_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka2.startAnimation(rotateBack);
                }
            }
        });

        text_bottom2_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.hrc_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });



        karta_3.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom3.setHeight(textHeightDPInahore);
                    text_bottom3_2.setHeight(textHeightDPIdole);
                    text_bottom3_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka3.startAnimation(rotate);
                }
                else{
                    text_bottom3.setHeight(0);
                    text_bottom3_2.setHeight(0);
                    text_bottom3_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka3.startAnimation(rotateBack);
                }
            }
        });

        text_bottom3_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.hsc_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        text_bottom3_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.sc_rules_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        karta_4.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom4.setHeight(textHeightDPInahore);
                    text_bottom4_2.setHeight(textHeightDPIdole);
                    text_bottom4_3.setHeight(textHeightDPIdole);
                    text_bottom4_4.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka4.startAnimation(rotate);

                }
                else{
                    text_bottom4.setHeight(0);
                    text_bottom4_2.setHeight(0);
                    text_bottom4_3.setHeight(0);
                    text_bottom4_4.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka4.startAnimation(rotateBack);
                }
            }
        });

        text_bottom4_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.icj_guide_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


        text_bottom4_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.icj_guide_odkaz2));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        text_bottom4_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.icj_memorial_sample));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

//SPDC
        karta_5.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom5.setHeight(textHeightDPInahore);
                    text_bottom5_2.setHeight(textHeightDPIdole);
                    text_bottom5_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka5.startAnimation(rotate);
                }
                else{
                    text_bottom5.setHeight(0);
                    text_bottom5_2.setHeight(0);
                    text_bottom5_3.setHeight(0);
                    count=0;
                RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                rotateBack.setDuration(300);
                rotateBack.setInterpolator(new LinearInterpolator());
                rotateBack.setFillAfter(true);
                rotateBack.setFillEnabled(true);
                sipka5.startAnimation(rotateBack);
                }
            }
        });

        text_bottom5_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.dis_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


//legal
        karta_6.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom6.setHeight(textHeightDPInahore_dlouhy);
                    text_bottom6_2.setHeight(textHeightDPIdole);
                    text_bottom6_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka6.startAnimation(rotate);
                }
                else{
                    text_bottom6.setHeight(0);
                    text_bottom6_2.setHeight(0);
                    text_bottom6_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka6.startAnimation(rotateBack);
                }
            }
        });

        text_bottom6_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.htc_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });



//SPCE
        karta_7.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom7.setHeight(textHeightDPInahore_jeste_delsi);
                    text_bottom7_2.setHeight(textHeightDPIdole);
                    text_bottom7_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka7.startAnimation(rotate);
                }
                else{
                    text_bottom7.setHeight(0);
                    text_bottom7_2.setHeight(0);
                    text_bottom7_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka7.startAnimation(rotateBack);
                }
            }
        });

        text_bottom7_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.ecosoc_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


//AU
        karta_8.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom8.setHeight(textHeightDPInahore_jeste_delsi);
                    text_bottom8_2.setHeight(textHeightDPIdole);
                    text_bottom8_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka8.startAnimation(rotate);
                }
                else{
                    text_bottom8.setHeight(0);
                    text_bottom8_2.setHeight(0);
                    text_bottom8_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka8.startAnimation(rotateBack);
                }
            }
        });

        text_bottom8_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.ec_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


        //SDC
        karta_9.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom9.setHeight(textHeightDPInahore_jeste_delsi);
                    text_bottom9_2.setHeight(textHeightDPIdole);
                    text_bottom9_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka9.startAnimation(rotate);
                }
                else{
                    text_bottom9.setHeight(0);
                    text_bottom9_2.setHeight(0);
                    text_bottom9_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka9.startAnimation(rotateBack);
                }
            }
        });

        text_bottom9_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.gec_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


//drugs and crime
        karta_10.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom10.setHeight(textHeightDPInahore);
                    text_bottom10_2.setHeight(textHeightDPIdole);
                    text_bottom10_3.setHeight(textHeightDPIdole);
                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka10.startAnimation(rotate);
                }
                else{
                    text_bottom10.setHeight(0);
                    text_bottom10_2.setHeight(0);
                    text_bottom10_3.setHeight(0);
                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka10.startAnimation(rotateBack);
                }
            }
        });

        text_bottom10_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.ecofin_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


//who
        karta_11.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count == 0){
                    text_bottom11.setHeight(textHeightDPInahore_jeste_delsi);
                    text_bottom11_2.setHeight(textHeightDPIdole);

                    count=1;
                    RotateAnimation rotate= new RotateAnimation(0,90, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(300);
                    rotate.setInterpolator(new LinearInterpolator());
                    rotate.setFillAfter(true);
                    rotate.setFillEnabled(true);
                    sipka11.startAnimation(rotate);
                }
                else{
                    text_bottom11.setHeight(0);
                    text_bottom11_2.setHeight(0);

                    count=0;
                    RotateAnimation rotateBack = new RotateAnimation(90,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                    rotateBack.setDuration(300);
                    rotateBack.setInterpolator(new LinearInterpolator());
                    rotateBack.setFillAfter(true);
                    rotateBack.setFillEnabled(true);
                    sipka11.startAnimation(rotateBack);
                }
            }
        });

        text_bottom11_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(getContext().getResources().getString(R.string.who_research_odkaz));
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });





        // Inflate the layout for this fragment
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