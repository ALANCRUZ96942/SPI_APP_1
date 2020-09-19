package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicio);
        Button botonInicio =(Button)findViewById(R.id.botonInicio);
        botonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent3, 0);
            }
        });

    }
}
