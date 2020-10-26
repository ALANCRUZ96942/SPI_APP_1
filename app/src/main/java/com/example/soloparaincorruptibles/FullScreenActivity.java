package com.example.soloparaincorruptibles;

import androidx.appcompat.app.ActionBar;
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

import android.os.Bundle;

public class FullScreenActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView = findViewById(R.id.image_view);

        ActionBar actionBar = getSupportActionBar();

        actionBar.hide();
        actionBar.setTitle("Full Screen Image");

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.galeryContent[position]);

    }
}