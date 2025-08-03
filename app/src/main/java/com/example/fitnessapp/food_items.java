package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class food_items extends AppCompatActivity {
    ListView listview;
    String[] pages={"Oatmeal","Avocado","Walnuts","Greek Yogurt","Mushrooms","Eggs","Edamame",
            "Sweet Potatoes", "Kiwi","Kale","Barley","Pumpkin","Nut Butter","Chard"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items);
        listview=findViewById(R.id.lv1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(food_items.this, android.R.layout.simple_dropdown_item_1line,pages);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
                Toast.makeText(food_items.this, "Clicked" + pages[position], Toast.LENGTH_SHORT).show();
            }
    });}
    public void addFood(View view){
        Intent i=new Intent(this,add_food.class);
        startActivity(i);
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