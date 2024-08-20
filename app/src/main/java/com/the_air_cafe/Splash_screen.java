package com.the_air_cafe;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread td = new Thread();
        td.run();
        {

            try {
                sleep(2000);
            } catch (InterruptedException excep) {
                excep.printStackTrace();
            } finally {
                Intent intent = new Intent(Splash_screen.this, MainActivity.class);
                startActivity(intent);
            }
            td.start();
        }
    }
}