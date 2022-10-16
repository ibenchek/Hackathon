package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import com.example.login.ui.login.LoginActivity;

public class SplachScreenActivity extends AppCompatActivity {

    private final int SPLASH_SCREEN_TIMEOUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        //regiriger vers login après 5 secondes

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //demarer page
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

                startActivity(intent);
                finish();
            }
        };

        //handler post delayed
        new Handler().postDelayed(runnable, SPLASH_SCREEN_TIMEOUT);



    }
}