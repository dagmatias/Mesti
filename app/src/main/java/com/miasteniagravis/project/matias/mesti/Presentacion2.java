package com.miasteniagravis.project.matias.mesti;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Presentacion2 extends AppCompatActivity {

    private TextView Texto;
    private TextView Texto1;
    private TextView Texto2;
    private TextView Texto3;
    private TextView Texto4;


    private Typeface RalewayRegular;
    private Typeface RalewayMedium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        String fuente1 = "fonts/RalewayRegular.ttf";
        this.RalewayRegular = Typeface.createFromAsset(getAssets(),fuente1);
        String fuente2 = "fonts/RalewayMedium.ttf";
        this.RalewayMedium = Typeface.createFromAsset(getAssets(),fuente2);

        Texto = (Button) findViewById(R.id.button);
        Texto.setTypeface(RalewayRegular);
        Texto1 = (Button) findViewById(R.id.button1);
        Texto1.setTypeface(RalewayRegular);
        Texto2 = (TextView) findViewById(R.id.textView);
        Texto2.setTypeface(RalewayRegular);
        Texto3 = (TextView) findViewById(R.id.textView2);
        Texto3.setTypeface(RalewayMedium);
        Texto4 = (TextView) findViewById(R.id.textView3);
        Texto4.setTypeface(RalewayMedium);
    }
}
