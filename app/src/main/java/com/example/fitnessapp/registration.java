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


public class registration extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth mAuth;
    public TextView tv2;
    public EditText et1,et2,et3,et4;
    public Button bt1,bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_registration);
        mAuth = FirebaseAuth.getInstance();
        tv2 = findViewById(R.id.tv2);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

        bt1.setOnClickListener(view -> {
            String user = et1.getText().toString().trim();
            String name = et2.getText().toString().trim();
            String pass =  et3.getText().toString().trim();

            if(user.isEmpty()){
                et1.setError("Email cannot be empty");
            }
            if(name.isEmpty()){
                et2.setError("name cannot be empty");
            }
            if(pass.isEmpty()){
                et3.setError("password cannot be empty");
            }else{
                mAuth.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        Toast.makeText(registration.this, "Register successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(registration.this,MainActivity.class));
                    }else{
                        Toast.makeText(registration.this, "signup failed"+ Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void onClick(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void btClick(View view){
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }


}