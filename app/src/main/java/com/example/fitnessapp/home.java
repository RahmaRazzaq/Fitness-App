package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    ListView listview;
    String[] pages={"View/Add Food Items","View/Add Exercise","Calculate BMI","Calculate Calories"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listview=findViewById(R.id.lv1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(home.this, android.R.layout.simple_dropdown_item_1line,pages);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
                if(pages[position]=="View/Add Food Items"){
                    Intent intent = new Intent(home.this, food_items.class);
                    startActivity(intent);
                    Toast.makeText(home.this, "Clicked" + pages[position], Toast.LENGTH_SHORT).show();
                }
                if(pages[position]=="View/Add Exercise"){
                    Intent intent = new Intent(home.this, exercise.class);
                    startActivity(intent);
                    Toast.makeText(home.this, "Clicked" + pages[position], Toast.LENGTH_SHORT).show();
                }
                if(pages[position]=="Calculate BMI"){
                    Intent intent = new Intent(home.this, bmi.class);
                    startActivity(intent);
                    Toast.makeText(home.this, "Clicked" + pages[position], Toast.LENGTH_SHORT).show();
                }
                if(pages[position]=="Calculate Calories"){
                    Intent intent = new Intent(home.this, calories.class);
                    startActivity(intent);
                    Toast.makeText(home.this, "Clicked" + pages[position], Toast.LENGTH_SHORT).show();
                }


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
}