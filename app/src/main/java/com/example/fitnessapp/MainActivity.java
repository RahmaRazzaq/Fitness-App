package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText et1,et2,et3;
    public Button bt1,bt2;
    public TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        et1 = findViewById(R.id.et2);
        et2 = findViewById(R.id.et3);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

        bt1.setOnClickListener(view -> {

            String name = et1.getText().toString();
            String pass = et2.getText().toString();
            if(!name.isEmpty()){
                if(!pass.isEmpty()){
                    auth.signInWithEmailAndPassword(name,pass).addOnSuccessListener(authResult -> {
                        Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this,home.class));
                        finish();
                    }).addOnFailureListener(e -> Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show());
                }else{
                    et2.setError("password cannot be empty");
                }
            }else {
                et1.setError("name cannot be empty");
            }
        });
        tv1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,registration.class)));

    }

    public void onClick(View view) {
        Intent i=new Intent(this,registration.class);
        startActivity(i);
    }
    public void bClick(View view) {
        Intent i=new Intent(this,home.class);
        startActivity(i);
    }

    public void btClick(View view) {
        Intent i=new Intent(this,home.class);
        startActivity(i);
    }
}