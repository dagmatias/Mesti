package com.miasteniagravis.project.matias.mesti;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private TextView Texto;
    private TextView Texto2;
    private TextView Texto3;
    private TextView Texto4;
    private TextView Texto5;


    private Typeface RalewayRegular;
    private Typeface SnigletRegular;
    private Typeface RalewayBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        String fuente1 = "fonts/RalewayRegular.ttf";
        this.RalewayRegular = Typeface.createFromAsset(getAssets(),fuente1);
        String fuente2 = "fonts/SnigletRegular.ttf";
        this.SnigletRegular = Typeface.createFromAsset(getAssets(),fuente2);
        String fuente3 = "fonts/RalewayBold.ttf";
        this.RalewayBold = Typeface.createFromAsset(getAssets(),fuente3);

        Texto = (TextView) findViewById(R.id.button);
        Texto.setTypeface(RalewayRegular);
        Texto2 = (TextView) findViewById(R.id.textView);
        Texto2.setTypeface(SnigletRegular);
        Texto3 = (TextView) findViewById(R.id.textView2);
        Texto3.setTypeface(RalewayRegular);
        Texto4 = (TextView) findViewById(R.id.textView3);
        Texto4.setTypeface(RalewayRegular);
        Texto5 = (TextView) findViewById(R.id.textView4);
        Texto5.setTypeface(RalewayBold);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Registro.this, Pregunta0.class);
                startActivity(intent);
            }
        },5000);

    }
}
