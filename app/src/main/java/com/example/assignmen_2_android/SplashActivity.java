package com.example.assignmen_2_android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // to navigate from splash screen to home in 3000 milliseconds time
        new Handler().postDelayed(() -> {
            // Start your app main activity
            Intent intent = new Intent(this , HomeActivity.class);
            startActivity(intent);
            // close this activity
            finish();
        }, 3000);

    }

}
