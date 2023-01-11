package com.example.activityintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.exmaple.application.example.EXTRA_TEXT";
    public static final String  EXTRA_NUMBER = "com.exmaple.application.example.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LogIn = findViewById(R.id.login);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
                openActivity2();
            }
        });


    }

    public void openActivity2(){
        EditText username = findViewById(R.id.username);
        String text = username.getText().toString();

        EditText password = findViewById(R.id.password);
        int number = Integer.parseInt(password.getText().toString());

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_TEXT,text);
        intent.putExtra(EXTRA_NUMBER,number);
        startActivity(intent);

    }
}