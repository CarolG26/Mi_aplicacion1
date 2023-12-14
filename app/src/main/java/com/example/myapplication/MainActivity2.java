package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void Inventario(View view)
    {
        Intent intento = new Intent(this, InventarioActivity.class);
        startActivity(intento);
    }

    public void venta(View view)
    {
        Intent intento = new Intent(this, VentaActivity.class);
        startActivity(intento);
    }

    public void Salir(View view)
    {
        Intent intento = new Intent(this, OtraActivity.class);
        startActivity(intento);
    }



}