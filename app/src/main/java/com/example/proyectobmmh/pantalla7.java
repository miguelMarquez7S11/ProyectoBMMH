package com.example.proyectobmmh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantalla7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla7);
    }
    public void pantalla2(View v)
    {
        Intent ventanaIndice = new Intent(this, pantalla2.class);
        startActivity(ventanaIndice);
        finish();
    }
}
