package com.example.activityintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import  java.lang.String;

public class MainActivity2 extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.exmaple.application.example.EXTRA_TEXT";
    public static final String  EXTRA_TEXT2 = "com.exmaple.application.example.EXTRA_NUMBER";

    String Volume;
    String SA;

    EditText length;
    EditText width ;
    EditText height ;
    TextView ResultVol;
    TextView ResultSA ;
    Button btnVolume;
    Button btnSA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = (intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0));

        TextView textviewName = findViewById(R.id.textViewName);
        textviewName.setText(text);

         length = findViewById(R.id.length);
         width = findViewById(R.id.width);
         height = findViewById(R.id.height);
         ResultVol = findViewById(R.id.ResultVol);
         ResultSA = findViewById(R.id.ResultSA);
         btnVolume= findViewById(R.id.btnvolume);
         btnSA= findViewById(R.id.btnSA);

         btnVolume.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //volume();

                 Double value1 = Double.parseDouble(length.getText().toString());
                 Double value2 = Double.parseDouble(width.getText().toString());
                 Double value3 = Double.parseDouble(height.getText().toString());
                 Box b1 = new Box(value1,value2,value3);

                 Double calculateVolume  = b1.Volume();
                 Double calculateSA  = b1.LargestSurfaceArea();

                Volume = calculateVolume.toString();
                SA =  calculateSA.toString();
                 openActivity3();

                 Toast.makeText(getApplicationContext(),"GOOD JOB",Toast.LENGTH_SHORT).show();
             }
         });

        btnSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //volume();

                Double value1 = Double.parseDouble(length.getText().toString());
                Double value2 = Double.parseDouble(width.getText().toString());
                Double value3 = Double.parseDouble(height.getText().toString());
                Box b1 = new Box(value1,value2,value3);

                Double calculateVolume  = b1.Volume();
                Double calculateSA  = b1.LargestSurfaceArea();

                Volume = calculateVolume.toString();
                SA =  calculateSA.toString();
                openActivity3();

                Toast.makeText(getApplicationContext(),"GOOD JOB",Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void openActivity3(){
        //EditText username = findViewById(R.id.username);
        //String text = Volume.getText().toString();

        //EditText password = findViewById(R.id.password);
       // int number = Integer.parseInt(password.getText().toString());

        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra(EXTRA_TEXT,Volume);
        intent.putExtra(EXTRA_TEXT2,SA);

        startActivity(intent);
    };
}