package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TimePicker;

public class Denuncia1 extends AppCompatActivity {

    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncia1);
        Button botonSiguiente =(Button)findViewById(R.id.siguiente0);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.primero)));
        this.window = getWindow();
        window.setStatusBarColor(getColor(R.color.oscuro));
        window.setNavigationBarColor(getColor(R.color.oscuro));



        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(v.getContext(), Denuncias.class);
                startActivityForResult(intentA, 0);
            }
        });


    }


    public void abrirAyuda(View view) {
        Dialog settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout, null));
        settingsDialog.show();
    }
}
