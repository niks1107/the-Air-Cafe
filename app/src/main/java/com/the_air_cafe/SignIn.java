package com.the_air_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    Button b;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        b = findViewById(R.id.button);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);

b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (user.getText().toString().equals("kevin")&&pass.getText().toString().equals("123"))
        {
            Intent i=new Intent(SignIn.this,menus.class);
            startActivity(i);

            }
        else
        {
            Toast.makeText(SignIn.this, "user/password is invalid", Toast.LENGTH_SHORT).show();
        }
    }
});
      }
    }



