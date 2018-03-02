package com.example.ramonsl.apphotel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton ibCall;
    private ImageButton ibSite;
    private ImageButton ibLocalizacao;
    private ImageButton ibFace;
    private TextView tvFone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibCall=findViewById(R.id.ibCall);
        tvFone=findViewById(R.id.tvFone);
        ibSite=findViewById(R.id.imSite);
        ibLocalizacao=findViewById(R.id.imLocalizacao);
        ibFace= findViewById(R.id.imFace);




        ibCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +tvFone.getText().toString() ));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        ibFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri webpage = Uri.parse("hhttps://www.facebook.com/Portal-Torres-Hotel-251621528238798/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });


        ibSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri webpage = Uri.parse("http://www.portaltorreshotel.com.br");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });

        ibLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri webpage = Uri.parse("https://www.google.com.br/maps/dir/''/portaltorreshotel/data=!4m5!4m4!1m0!1m2!1m1!1s0x9522695e3db7e1b9:0xc37a2a9ea8b35c91?sa=X&ved=0ahUKEwjFq_K9ps7ZAhURslMKHTmJA3MQ9RcIvAEwCw\n");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });

    }


}
