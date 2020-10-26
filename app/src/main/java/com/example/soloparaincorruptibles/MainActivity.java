package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton denuncias = findViewById(R.id.denuncias);
        ImageButton galeria = findViewById(R.id.galeria);
        ImageButton informate = findViewById(R.id.informate);
        ImageButton juegos = findViewById(R.id.juegos);

        denuncias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Denuncia1.class);
                startActivityForResult(intent2, 0);
            }
        });
        galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Galeria.class);
                startActivityForResult(intent2, 0);
            }
        });
        informate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Informacion.class);
                startActivityForResult(intent2, 0);
            }
        });
        juegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Juegos.class);
                startActivityForResult(intent2, 0);
            }
        });

    }
}
