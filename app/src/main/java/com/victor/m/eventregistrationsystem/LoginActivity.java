package com.victor.m.eventregistrationsystem;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new view onClickListener() {
            @Override
            public void onClick (View v){
                intent i = new Intent(LoginActivity.this.EventKeyDetail. class);
                startActivity(i);
                finish();
            }
        });
    }
}
