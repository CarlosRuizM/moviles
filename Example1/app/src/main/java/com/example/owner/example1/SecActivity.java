package com.example.owner.example1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    TextView myTextView;
    Intent currentIntent;
    String myStringExtra;
    int myIntegerExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        currentIntent = getIntent();
        myStringExtra = currentIntent.getStringExtra("stringToSend");

        myTextView = findViewById(R.id.textView);
        myTextView.setText(myStringExtra);

    }
}
