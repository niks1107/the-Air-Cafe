package com.the_air_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class continental extends AppCompatActivity {
Button ord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continental);
        ord=findViewById(R.id.order);

        ord.setOnClickListener(view -> {
            Intent i =new Intent(continental.this,bill.class);
            startActivity(i);

        });
    }
}