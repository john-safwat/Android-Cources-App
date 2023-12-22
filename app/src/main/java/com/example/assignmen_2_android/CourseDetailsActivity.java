package com.example.assignmen_2_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class CourseDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton androidButton;
    ImageView courseImage;
    TextView content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cource_details);
        androidButton = findViewById(R.id.btn_arrow_back);
        androidButton.setOnClickListener(this);

        courseImage = findViewById(R.id.img_course);
        content = findViewById(R.id.text_course_content);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            courseImage.setImageResource(extras.getInt("image"));
            content.setText(extras.getString("content"));
        }

    }


    @Override
    public void onClick(View view) {
        // navigate back to home screen
        finish();
    }
}
