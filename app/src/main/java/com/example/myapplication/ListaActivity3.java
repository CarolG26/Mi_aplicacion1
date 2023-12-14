package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adaptadores.ListaVentasAdapter;
import com.example.myapplication.db.DbVentas;
import com.example.myapplication.entidades.Ventas;

import java.util.ArrayList;

public class ListaActivity3 extends AppCompatActivity {
    RecyclerView listaventas;
    ArrayList<Ventas> listaArrayventas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista3);
        listaventas = findViewById(R.id.Listaventas);
        listaventas.setLayoutManager(new LinearLayoutManager(this));

        DbVentas dbVentas = new DbVentas(ListaActivity3.this);

        listaArrayventas =new ArrayList<>();

        ListaVentasAdapter adapter = new ListaVentasAdapter(dbVentas.mostrarventas());
        listaventas.setAdapter(adapter);

    }

}