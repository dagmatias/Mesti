package com.miasteniagravis.project.matias.mesti;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class comenzar extends AppCompatActivity {

    private TextView Texto;
    private TextView Texto2;
    private TextView Texto3;


    private Typeface RalewayRegular;
    private Typeface RalewayBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comenzar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        String fuente1 = "fonts/RalewayRegular.ttf";
        this.RalewayRegular = Typeface.createFromAsset(getAssets(),fuente1);
        String fuente2 = "fonts/RalewayBold.ttf";
        this.RalewayBold = Typeface.createFromAsset(getAssets(),fuente2);

        Texto = (TextView) findViewById(R.id.button);
        Texto.setTypeface(RalewayRegular);
        Texto2 = (TextView) findViewById(R.id.textView);
        Texto2.setTypeface(RalewayRegular);
        Texto3 = (TextView) findViewById(R.id.textView2);
        Texto3.setTypeface(RalewayBold);

    }
}
