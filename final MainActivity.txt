package com.example.animeplayerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private  EditText etName;
   private EditText etPassword;
   private Button eLogin;

   private String username= "Admin";
   private String password= "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etname);
        etPassword = findViewById(R.id.etpassword);
        eLogin = findViewById(R.id.bt);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = etName.getText().toString();
                String inputPassword = etPassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Enter details",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(MainActivity.this,Homepage.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean validate(String name , String pass)
    {
        if(name.equals(username) && pass.equals(password))
        {
            return true;
        }
        return false;
    }
}