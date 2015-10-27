package com.victor.m.eventregistrationsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by victor on 10/27/15.
 */
public class Splash extends Activity {
//    set the variable for the timeout
    private static int SPLASH_TIME=3000;


    @Override
//    onCreate creates the view
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView sets the content to be viewed which is from splash_screen xml file.
        setContentView(R.layout.splash_screen);

//        this method handles an action once the 3 seconds end
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                so it moves to the next screen,login screen when the three seconds are over
                Intent i = new Intent(Splash.this, LoginActivity.class);

//                variables stating the start of the method and end of it
                startActivity(i);

                finish();
            }
        },SPLASH_TIME);
    }
}
