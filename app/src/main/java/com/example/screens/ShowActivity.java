package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");

            // Do something with the name and number


            TextView nameView = findViewById(R.id.textViewNameShow);
            nameView.setText(name);


        }
    }
}