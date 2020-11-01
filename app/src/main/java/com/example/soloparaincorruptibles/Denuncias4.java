package com.example.soloparaincorruptibles;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class Denuncias4 extends AppCompatActivity {
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncias4);
        Button siguiente = (Button)(findViewById(R.id.siguiente4));




        this.window = getWindow();
        window.setStatusBarColor(getColor(R.color.oscuro));
        window.setNavigationBarColor(getColor(R.color.oscuro));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.primero)));

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(v.getContext(), Denuncias5.class);
                startActivityForResult(intentA, 0);
            }




        });




    }



    public void abrirCalendario(View v){
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog a = new DatePickerDialog(Denuncias4.this, R.style.dialogo, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            }
        },anio, mes,dia);

        a.show();
    }


    public void abrirReloj(View view) {

        Calendar cal2 = Calendar.getInstance();
        int hora = cal2.get(Calendar.HOUR_OF_DAY);
        int minuto = cal2.get(Calendar.MINUTE);


      TimePickerDialog b = new TimePickerDialog(Denuncias4.this, R.style.dialogo,new TimePickerDialog.OnTimeSetListener() {
          @Override
          public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

          }
      }, hora, minuto,true);
        b.show();
    }
}