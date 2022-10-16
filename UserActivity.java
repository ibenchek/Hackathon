package com.example.login;

//import static com.example.login.R.id.imageButtonRet;
import static com.example.login.R.id.imageButtonRet;
import static com.example.login.R.id.imageButtonUser;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserActivity extends AppCompatActivity {

    private ImageButton imagebuttonone;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        this.imagebuttonone = (ImageButton) findViewById(imageButtonRet);

        imagebuttonone.setOnClickListener(view -> {
            Intent  otherActivity = new Intent(getApplicationContext(), Menu.class);
            startActivity(otherActivity);
            finish();
        });
    }

}