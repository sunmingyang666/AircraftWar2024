package com.example.aircraftwar2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//new11
    }

    public void offline(){
        //onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);

    }
}