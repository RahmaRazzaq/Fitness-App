package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class add_exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exercise);
    }
    public void bee1Click(View view){
        Intent i=new Intent(this,home.class);
        startActivity(i);
    }
    public void bee2Click(View view){
        Intent i=new Intent(this,about.class);
        startActivity(i);
    }
    public void bee3Click(View view){
        Intent i=new Intent(this,contact.class);
        startActivity(i);
    }
}