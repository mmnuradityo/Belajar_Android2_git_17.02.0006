package com.project_n.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.project_n.splashscreen.util.PreferenceHelper;

public class SplashScreen extends AppCompatActivity {

    PreferenceHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        instance = PreferenceHelper.getInstance(getApplicationContext());
        int splasInterval = 2500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!instance.isLogin()){
                    Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(i);
                }else{
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                }
            }
        }, splasInterval);

    }
}
