package com.example.activityintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity2.EXTRA_TEXT);
        String text2 = intent.getStringExtra(MainActivity2.EXTRA_TEXT2);


        TextView textviewFinalVol = findViewById(R.id.FinalVol);
        textviewFinalVol.setText(text);

        TextView textviewFinalSA = findViewById(R.id.FinalSA);
        textviewFinalSA.setText(text2);
    }
}