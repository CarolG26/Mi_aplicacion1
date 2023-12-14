package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OtraActivity extends AppCompatActivity {

    private EditText edit1, edit2;
    public String usuario;

    {
        usuario = "Jhonso";
    }

    private String contrasena;

    {
        contrasena = "D3j4vu";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
    }

    public void ingresar (View view){

        usuario = edit1.getText().toString();
        contrasena = edit2.getText().toString();

        if (usuario.length() != 0){
            if (usuario.equals("Jhonso")) {
                Toast.makeText(this, "Datos correctos", Toast.LENGTH_SHORT).show();
                if (contrasena.length() != 0) {
                    if (contrasena.equals("D3j4vu")) {
                        Toast.makeText(this, "Datos correctos", Toast.LENGTH_SHORT).show();

                        Intent intento = new Intent(this, MainActivity2.class);
                        startActivity(intento);

                    }else{
                      Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(this, "No puedes dejar campos vacios", Toast.LENGTH_SHORT).show();
                }

            }else{
              Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "No puedes dejar campos vacios", Toast.LENGTH_SHORT).show();
        }
        clear();

    }
    private void clear(){
        edit1.setText("");
        edit2.setText("");
        edit1.requestFocus();

    }



}