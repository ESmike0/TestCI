package com.github.yourusername.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
    }
}