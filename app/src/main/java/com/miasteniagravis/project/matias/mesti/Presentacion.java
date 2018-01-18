package com.miasteniagravis.project.matias.mesti;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Presentacion extends AppCompatActivity {

    private TextView Texto;
    private TextView Texto2;
    private TextView Texto3;
    private TextView Texto4;
    private TextView Texto5;
    private TextView Texto6;

    private Typeface RalewayRegular;
    private Typeface RalewayBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        String fuente1 = "fonts/RalewayRegular.ttf";
        this.RalewayRegular = Typeface.createFromAsset(getAssets(),fuente1);
        String fuente2 = "fonts/RalewayBold.ttf";
        this.RalewayBold = Typeface.createFromAsset(getAssets(),fuente2);

        Texto = (TextView) findViewById(R.id.presentaciontextView);
        Texto.setTypeface(RalewayRegular);
        Texto2 = (TextView) findViewById(R.id.presentaciontextView2);
        Texto2.setTypeface(RalewayRegular);
        Texto3 = (TextView) findViewById(R.id.presentaciontextView3);
        Texto3.setTypeface(RalewayBold);
        Texto4 = (TextView) findViewById(R.id.presentaciontextView4);
        Texto4.setTypeface(RalewayRegular);
        Texto5 = (TextView) findViewById(R.id.presentaciontextView5);
        Texto5.setTypeface(RalewayRegular);
        Texto6 = (TextView) findViewById(R.id.presentaciontextView6);
        Texto6.setTypeface(RalewayRegular);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Presentacion.this, Presentacion2.class);
                startActivity(intent);
            }
        },5000);


    }
}
