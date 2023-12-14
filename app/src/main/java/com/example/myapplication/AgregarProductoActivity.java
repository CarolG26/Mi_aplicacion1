package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AgregarProductoActivity extends AppCompatActivity {

    private EditText nombreProd, cantidadPro, precioComProd, precioVenPro;
    private Spinner spinertipop;
    private int contador=0, cantidadp;
    private String tipop;
    private String seleccionp;
    private ArrayList<Producto> productosi = new ArrayList<Producto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        cargarProducto();
        nombreProd =  findViewById(R.id.e_nomProducto);
        cantidadPro = findViewById(R.id.e_cantidad);
        precioComProd = findViewById(R.id.e_precioCom);
        precioVenPro =  findViewById(R.id.e_precioVen);
        spinertipop =  findViewById(R.id.spinner);
        String[] opciones= {"Cervezas","Rones","Aguardientes","Wiskey","Tequilas","Vodka","Vinos",
        "Paquetes","Cigarrillos"};
        ArrayAdapter<String> arreglo1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,opciones);
        spinertipop.setAdapter(arreglo1);
    }

    public void agregar(View view){
        String nombrep = nombreProd.getText().toString();
        cantidadp = Integer.parseInt(cantidadPro.getText().toString());
        double preciocomp = Double.parseDouble(precioComProd.getText().toString());
        double preciovenp = Double.parseDouble(precioVenPro.getText().toString());
        String seleccionp = spinertipop.getSelectedItem().toString();

        productosi.add(contador,new Producto(nombrep,seleccionp,cantidadp, preciocomp, preciovenp));
        contador+=1;
        guardarProducto();
        Toast.makeText(this, "producto agregado", Toast.LENGTH_SHORT).show();

    }

    public void guardarProducto(){
        try {
            FileOutputStream fos = openFileOutput("producto.dat", Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productosi);
            oos.close();
        } catch (Exception e) {

        }
    }

    public void cargarProducto(){
        try {
            FileInputStream fin = openFileInput("productosi.dat");
            ObjectInputStream oin = new ObjectInputStream(fin);
            productosi =(ArrayList<Producto>) oin.readObject();
            oin.close();
            contador = productosi.size()-1;
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

}