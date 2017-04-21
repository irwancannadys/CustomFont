package com.domikado.customfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.text);

        String font = "SEASRN__.ttf";

        Typeface face= Typeface.createFromAsset(getAssets(), font);
        tv1.setTypeface(face);
    }
}
