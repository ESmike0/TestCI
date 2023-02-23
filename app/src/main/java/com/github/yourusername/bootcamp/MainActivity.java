package com.github.yourusername.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        //Optional parameters
        button.setOnClickListener(v -> {
            Intent myIntent = new Intent(getApplicationContext(), GreetingActivity.class);
            EditText viewById = (EditText) findViewById(R.id.texteditlol);
            String value = viewById.getText().toString();
            myIntent.putExtra("name", value);
            v.getContext().startActivity(myIntent);
        });

    }
}