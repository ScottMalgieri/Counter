package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void on_click(View v)
    {
        TextView view = findViewById(R.id.msg);

        count +=1;
        view.setText("This Button"+ " Was Clicked: " + count + " Times!");

    }
}