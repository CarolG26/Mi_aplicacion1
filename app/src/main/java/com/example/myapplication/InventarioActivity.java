package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InventarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);
    }

    public void agregarProducto(View view)
    {
        Intent agregarProducto= new Intent(this,AgregarProductoActivity.class);
        startActivity(agregarProducto);
    }

    public void Atras(View view)
    {
        Intent Atras= new Intent(this, MainActivity2.class);
        startActivity(Atras);
    }
}
