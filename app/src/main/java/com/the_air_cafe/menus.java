package com.the_air_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menus extends AppCompatActivity {
Button south,north,cont,cold;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
    south = findViewById(R.id.southbtn);
    north = findViewById(R.id.northbtn);
    cont = findViewById(R.id.contbtn);
    cold = findViewById(R.id.coldbtn);

    south.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(menus.this, south.class);
            startActivity(i);
        }
    });

    north.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(menus.this, north.class);
            startActivity(i);
        }
    });
    cont.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(menus.this,continental.class);
            startActivity(i);
        }
    });
    cold.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(menus.this,colddrink.class);
            startActivity(i);
        }
    });
    }
}