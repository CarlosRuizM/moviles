package com.example.myapplication;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b_short, b_long;
Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_short=(Button)findViewById(R.id.b_short);
        b_long=(Button)findViewById(R.id.b_long);
        vibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        b_short.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  vibrator.vibrate(700);
            }
        });
        b_long.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(7000);
            }
        });
    }
}