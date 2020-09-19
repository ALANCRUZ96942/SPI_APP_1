package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Denuncia1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncia1);

        Button opciona = findViewById(R.id.opciona);

        opciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent5, 0);
            }
        });


    }
}
