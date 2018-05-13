package com.example.android.golfinatorandboostboiemilioooosgarage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set fixed background with scrolling content

        getWindow().setBackgroundDrawableResource(R.drawable.smokebg);
    }
}
