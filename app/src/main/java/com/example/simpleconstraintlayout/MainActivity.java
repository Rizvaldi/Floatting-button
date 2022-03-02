package com.example.simpleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_email, et_password;
    Button login;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));

        et_email = findViewById(R.id.edEmail);
        et_password = findViewById(R.id.edPassword);
        login = findViewById(R.id.btSignin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validasi();

            }
        });
    }

    private void validasi() {
        email = et_email.getText().toString();
        password = et_password.getText().toString();

        if (email.equals("paldi@gmail.com") && password.equals("paldi12345")) {
            Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();

        }
        else if(email != ("paldi@gmail.com") && password.equals("paldi12345"))
        {
            Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();

        }
        else if(email.equals("paldi@gmail.com") && password != ("paldi12345"))
        {
            Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
        }
        else if(email != ("paldi@gmail.com") && password != ("paldi12345"))
        {
            Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();

        }
    }
}