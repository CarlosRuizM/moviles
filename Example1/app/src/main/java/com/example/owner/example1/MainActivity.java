package com.example.owner.example1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        myName = findViewById(R.id.)
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, SecActivity.class);

                String nameToSend = myName.getText().toString();
                myIntent.putExtra("stringToSend", nameToSend);
                myIntent.putExtra("myInteger", 2)

                startActivity(myIntent);

            }
        });
    }
}
