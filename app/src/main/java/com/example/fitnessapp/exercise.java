package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class exercise extends AppCompatActivity {
    ListView listview;
    String[] pages={"Chair squat","Bridge","Knee pushup","Stationary lunge","Plank to Downward Dog","Straight-leg donkey kick","Bird Dog","Forearm plank","Side-lying hip abduction"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        listview = findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(exercise.this, android.R.layout.simple_dropdown_item_1line, pages);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(exercise.this, "Clicked" + pages[position], Toast.LENGTH_SHORT).show();
            }
        });
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

    public void addFood(View view) {
        Intent i=new Intent(this,add_food.class);
        startActivity(i);
    }
    public void addEx(View view) {
        Intent i=new Intent(this,add_exercise.class);
        startActivity(i);
    }
}