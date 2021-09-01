package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "salom", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "salom", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "salom", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "salom", Toast.LENGTH_LONG).show();
        //asas
//        sas
    }
    public void salom(){
        int a=10;
    }
    public void makeToast(){
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
    }
}