package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class Galeria extends AppCompatActivity{

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(this));



        getSupportActionBar().setTitle("Galeria");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FullScreenActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);
            }
        });
    }
}
