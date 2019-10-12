package com.example.proyectobmmh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }

    public void pantallaAcercaDe(View v)
    {
        Intent ventanaAcercaDe = new Intent(this, pantalla3.class);
        startActivity(ventanaAcercaDe);
        finish();
    }

    public void boton1(View v)
    {
        Intent ventana = new Intent(this, pantalla4.class);
        startActivity(ventana);
        finish();
    }

    public void boton2(View v)
    {
        Intent ventana = new Intent(this, pantalla5.class);
        startActivity(ventana);
        finish();
    }
    public void boton3(View v)
    {
        Intent ventana = new Intent(this, pantalla6.class);
        startActivity(ventana);
        finish();
    }
    public void boton4(View v)
    {
        Intent ventana = new Intent(this, pantalla7.class);
        startActivity(ventana);
        finish();
    }

    public void boton5(View v)
    {
        Intent ventana = new Intent(this, pantalla8.class);
        startActivity(ventana);
        finish();
    }

    public void boton6(View v)
    {
        Intent ventana = new Intent(this, pantalla9.class);
        startActivity(ventana);
        finish();
    }

    public void boton7(View v)
    {
        Intent ventana = new Intent(this, pantalla10.class);
        startActivity(ventana);
        finish();
    }
}
