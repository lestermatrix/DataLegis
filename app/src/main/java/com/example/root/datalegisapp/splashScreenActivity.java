package com.example.root.datalegisapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class splashScreenActivity extends AppCompatActivity {

    private static boolean splashLoaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (!splashLoaded) {
            setContentView(R.layout.activity_splash_screen);
            int secondsDelayed = 2;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(splashScreenActivity.this, LoginActivity.class));
                    finish();
                }
            }, secondsDelayed * 500);

            splashLoaded = true;
        } else {
            Intent goToMainActivity = new Intent(splashScreenActivity.this, LoginActivity.class);
            goToMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMainActivity);
            finish();
        }
    }
}