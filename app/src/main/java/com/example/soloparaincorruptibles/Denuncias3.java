package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Denuncias3 extends AppCompatActivity {
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncias3);
        Button siguiente = (Button)(findViewById(R.id.siguiente3));
        this.window = getWindow();
        window.setStatusBarColor(getColor(R.color.oscuro));
        window.setNavigationBarColor(getColor(R.color.oscuro));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.primero)));

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(v.getContext(), Denuncias4.class);
                startActivityForResult(intentA, 0);
            }
        });

    }
}