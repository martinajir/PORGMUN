package com.porgmun.martinajireckova.porgmun.activity;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Calendar;

import com.porgmun.martinajireckova.porgmun.R;


public class HomeFragment extends Fragment {

    private TextView logo;
    private TextView event;
    private TextView date;
    private ImageButton alert;
    private ImageButton navigation;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        logo = (TextView)rootView.findViewById(R.id.text);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "OlsenReg.ttf");
        logo.setTypeface(typeface);
        event = (TextView)rootView.findViewById(R.id.event);
        date = (TextView)rootView.findViewById(R.id.date);
        alert = (ImageButton)rootView.findViewById(R.id.imageButton_alert);
       // navigation = (ImageButton)rootView.findViewById(R.id.imageButton_directions);



        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH);
        Log.i("month",new Integer(month).toString());
        int day = c.get(Calendar.DAY_OF_MONTH);
        Log.i("day",new Integer(day).toString());
        int hour = c.get(Calendar.HOUR_OF_DAY);
        Log.i("hour", new Integer(hour).toString());



        if(month==4 & day<10){

            if (day==6){
                if (hour<13){
                    event.setText("11:00-13:00 Registration");
                }
                if (hour>=13 && hour<16){
                    event.setText("13:00-16:30 Opening Ceremony");
                }
                if (hour>=16 && hour<21){
                    event.setText("19:00-21:00 Icebreakers");
                }
                if (hour>=21){
                    event.setText("09:00-17:00 Committees in session");
                    date.setText("7th April");
                }

            }
            if (day==7){
                if (hour<17){
                    event.setText("09:00-17:00 Committees in session");
                    date.setText("7th April");
                }
                if (hour>=17&&hour<=20){
                    event.setText("19:00-20:00 Prague Tour");
                    date.setText("7th April");
                }

                if (hour>20){
                    event.setText("09:00-16:00 Committees in session");
                    date.setText("8th April");
                }

            }
            if (day==8){
                if (hour<16){
                    event.setText("09:00-16:00 Committees in session");
                    date.setText("8th April");
                }

                if (hour>=16){
                    event.setText("10:00-12:00 Closing Ceremony");
                    date.setText("9th April");
                }


            }
            if (day==9){
                if (hour<=12){
                    event.setText("10:00-12:00 Closing Ceremony");
                    date.setText("9th April");
                }

            }
        }

        alert.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Calendar c = Calendar.getInstance();
                int month = c.get(Calendar.MONTH);
                Log.i("month",new Integer(month).toString());
                int day = c.get(Calendar.DAY_OF_MONTH);
                Log.i("day",new Integer(day).toString());
                int hour = c.get(Calendar.HOUR_OF_DAY);
                Log.i("hour", new Integer(hour).toString());

                if(month==3 & day<10){

                    if (day==6){
                        if (hour<13){
                            event.setText("11:00-13:00 Registration");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 6,11,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017,3,6,13,0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Opening Ceremony Registration")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Prague City Hall");

                            startActivity(intent);
                        }
                        if (hour>=13 && hour<16){
                            event.setText("13:00-16:30 Opening Ceremony");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 6,13,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017,3,6,15,0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Opening Ceremony")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Prague City Hall");

                            startActivity(intent);
                        }
                        if (hour>=16 && hour<21){
                            event.setText("19:00-21:00 Icebreakers");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 6,19,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017,3,6,21,0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Icebreakers")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Iris Exe Hotel");

                            startActivity(intent);
                        }
                        if (hour>=21){
                            event.setText("09:00-17:00 Committees in session");
                            date.setText("7th April");

                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 7,9,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 7, 17, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Committees in Session")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Gymnázium Nový PORG");

                            startActivity(intent);
                        }

                    }
                    if (day==7){
                        if (hour<17){
                            event.setText("09:00-17:00 Committees in session");
                            date.setText("7th April");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 7,9,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 7, 17, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Committees in Session")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Gymnázium Nový PORG");

                            startActivity(intent);
                        }
                        if (hour>=17&&hour<=20){
                            event.setText("19:00-20:00 Prague Tour");
                            date.setText("7th April");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 7,19,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 7, 20, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Prague Tour")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Wenceslas Square");

                            startActivity(intent);
                        }

                        if (hour>20){
                            event.setText("09:00-16:00 Committees in session");
                            date.setText("8th April");

                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 8,9,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 8, 16, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Committees in Session")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Gymnázium Nový PORG");

                            startActivity(intent);
                        }

                    }
                    if (day==8){
                        if (hour<16){
                            event.setText("09:00-16:00 Committees in session");
                            date.setText("8th April");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 8,9,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 8, 16, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Committees in Session")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Gymnázium Nový PORG");

                            startActivity(intent);
                        }

                        if (hour>=16){
                            event.setText("10:00-12:00 Closing Ceremony");
                            date.setText("9th April");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 9,10,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 9, 12, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Closing Ceremony")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Prague City Hall");

                            startActivity(intent);
                        }


                    }
                    if (day==9){
                        if (hour<=12){
                            event.setText("10:00-12:00 Closing Ceremony");
                            date.setText("9th April");
                            Calendar beginTime = Calendar.getInstance();
                            beginTime.set(2017, 3, 9,10,0);
                            Calendar endTime = Calendar.getInstance();
                            endTime.set(2017, 3, 9, 12, 0);

                            Intent intent = new Intent(Intent.ACTION_INSERT)
                                    .setData(CalendarContract.Events.CONTENT_URI)
                                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                                    .putExtra(CalendarContract.Events.TITLE, "PORGMUN Closing Ceremony")
                                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "Prague City Hall");

                            startActivity(intent);
                        }

                    }
                }
                else{
                    Calendar beginTime = Calendar.getInstance();
                    beginTime.set(2017, 3, 6,11,0);
                    Calendar endTime = Calendar.getInstance();
                    endTime.set(2017,3,6,13,0);

                    Intent intent = new Intent(Intent.ACTION_INSERT)
                            .setData(CalendarContract.Events.CONTENT_URI)
                            .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                            .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                            .putExtra(CalendarContract.Events.TITLE, "PORGMUN Opening Ceremony Registration")
                            .putExtra(CalendarContract.Events.EVENT_LOCATION, "Prague City Hall")
                            .putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY);

                    startActivity(intent);

                }


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