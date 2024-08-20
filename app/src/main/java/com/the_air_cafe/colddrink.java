package com.the_air_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colddrink extends AppCompatActivity {
Button ord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colddrink);
        ord=findViewById(R.id.order);

        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(colddrink.this,bill.class);
                startActivity(i);
            }
        });
    }
}