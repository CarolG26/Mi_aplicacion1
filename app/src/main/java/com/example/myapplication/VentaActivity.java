package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.db.DbVentas;

public class VentaActivity extends AppCompatActivity {
    EditText e_idr, e_nombrep, e_codigop, e_cantidadp, e_valoru, e_valort;
    Button b_guardarR;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);

        e_nombrep = findViewById(R.id.e_nombrep);
        e_codigop = findViewById(R.id.e_codigop);
        e_cantidadp = findViewById(R.id.e_cantidadp);
        e_valoru = findViewById(R.id.e_valoru);
        e_valort = findViewById(R.id.e_valort);
        b_guardarR = findViewById(R.id.b_guardarR);


        b_guardarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbVentas dbVentas = new DbVentas(VentaActivity.this);
                long id = dbVentas.insertarVentas(e_nombrep.getText().toString(), Integer.parseInt(e_codigop.getText().toString()), Integer.parseInt(e_cantidadp.getText().toString()), Double.parseDouble(e_valoru.getText().toString()), Double.parseDouble(e_valort.getText().toString()));

                if (id > 0){
                    Toast.makeText(VentaActivity.this, "Registro guardo correctamente", Toast.LENGTH_LONG).show();
                    limpiar();
                }else {
                    Toast.makeText(VentaActivity.this, "Error al guardar", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
    private void limpiar(){
        e_idr.setText("");
        e_nombrep.setText("");
        e_codigop.setText("");
        e_cantidadp.setText("");
        e_valoru.setText("");
        e_valort.setText("");
    }

}