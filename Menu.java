package com.example.login;

import static com.example.login.R.id.imageButtonUser;

import static com.example.login.R.id.imageButtoncarte;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton imagebuttonuser = (ImageButton) findViewById(imageButtonUser);
        ImageButton imagebuttoncarte = (ImageButton) findViewById(imageButtoncarte);

        imagebuttonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  otherActivity = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        imagebuttoncarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  otherActivity = new Intent(getApplicationContext(), PaymenntActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

    }
}