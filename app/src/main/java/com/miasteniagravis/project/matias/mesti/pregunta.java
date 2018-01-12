package com.miasteniagravis.project.matias.mesti;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class pregunta extends AppCompatActivity {

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
        setContentView(R.layout.activity_pregunta);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        String fuente1 = "fonts/RalewayRegular.ttf";
        this.RalewayRegular = Typeface.createFromAsset(getAssets(),fuente1);
        String fuente2 = "fonts/RalewayMedium.ttf";
        this.RalewayMedium = Typeface.createFromAsset(getAssets(),fuente2);

        Texto = (TextView) findViewById(R.id.button);
        Texto.setTypeface(RalewayRegular);
        Texto1 = (TextView) findViewById(R.id.button1);
        Texto1.setTypeface(RalewayRegular);
        Texto2 = (TextView) findViewById(R.id.textView);
        Texto2.setTypeface(RalewayRegular);
        Texto3 = (TextView) findViewById(R.id.textView2);
        Texto3.setTypeface(RalewayMedium);
        Texto4 = (TextView) findViewById(R.id.textView3);
        Texto4.setTypeface(RalewayMedium);



    }
}
