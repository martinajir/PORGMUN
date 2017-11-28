package com.porgmun.martinajireckova.porgmun.activity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.porgmun.martinajireckova.porgmun.R;


public class ContactFragment extends Fragment {

    private ImageView emailHanka;
    private ImageView emailHanka2;
    private TextView hankaMail;
    private TextView hankaMail2;
    private ImageView emailSimon;
    private TextView simonMail;
    private ImageView emailSara;
    private TextView saraMail;
    private ImageView emailMartina;
    private TextView martinaMail;
    private ImageView phoneHanka;
    private TextView hankaPhone;
    private ImageView phoneSara;
    private TextView saraPhone;
    private ImageView emailMirek;
    private TextView mirekMail;
    private ImageView emailLea;
    private TextView leaMail;


    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);

        emailHanka=(ImageView)rootView.findViewById(R.id.email_ikona_0);
        emailHanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "jirovska@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        emailHanka2=(ImageView)rootView.findViewById(R.id.email_ikona);
        emailHanka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "secretariat@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        hankaMail=(TextView)rootView.findViewById(R.id.hanka_mail);
        hankaMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "jirovska@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        hankaMail2=(TextView)rootView.findViewById(R.id.hanka_mail_2);
        hankaMail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "secretariat@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });


        phoneHanka=(ImageView)rootView.findViewById(R.id.phone_ikona_hanka);
        phoneHanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel::+420778042652"));
                startActivity(intent);//602480408

            }
        });

      hankaPhone=(TextView)rootView.findViewById(R.id.hanka_tel);
        hankaPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel::+420778042652"));
                startActivity(intent);//602480408

            }
        });


        phoneSara=(ImageView)rootView.findViewById(R.id.phone_ikona_sara);
        phoneSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel::+420773194105"));
                startActivity(intent);//602480408

            }
        });

        saraPhone=(TextView)rootView.findViewById(R.id.sara_tel);
        saraPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel::+420773194105"));
                startActivity(intent);//602480408

            }
        });


        emailSara=(ImageView)rootView.findViewById(R.id.email_ikona2);
        emailSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "secretariat@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        saraMail=(TextView)rootView.findViewById(R.id.sara_mail);
        saraMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "secretariat@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });


        simonMail =(TextView)rootView.findViewById(R.id.simon_mail);
       simonMail.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                       "mailto", "olmer@porgmun.cz", null));
               startActivity(Intent.createChooser(intent, "Choose an Email client :"));
           }
       });

        emailSimon =(ImageView)rootView.findViewById(R.id.email_ikona_simon);
        emailSimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "olmer@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        martinaMail=(TextView)rootView.findViewById(R.id.martina_mail);
        martinaMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "it@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        emailMartina=(ImageView)rootView.findViewById(R.id.email_ikona4);
        emailMartina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "it@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        mirekMail=(TextView)rootView.findViewById(R.id.mirek_mail);
        mirekMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "crha@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        emailMirek=(ImageView)rootView.findViewById(R.id.email_ikona_mirek);
        emailMirek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "crha@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        leaMail=(TextView)rootView.findViewById(R.id.lea_mail);
        leaMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "registration@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        emailLea=(ImageView)rootView.findViewById(R.id.email_ikona_lea);
        emailLea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "registration@porgmun.cz", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
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