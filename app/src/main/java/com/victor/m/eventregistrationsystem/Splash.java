package com.victor.m.eventregistrationsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by victor on 10/27/15.
 */
public class Splash extends Activity {

    private static int SPLASH_TIME=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, LoginActivity.class);
                startActivity(i);

                finish();
            }
        },SPLASH_TIME);
    }
}
