package com.example.myapplication.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.myapplication.entidades.Ventas;

import java.util.ArrayList;


public class DbVentas extends DbHelper {

    Context context;

    public DbVentas(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertarVentas(String nombrep, Integer codigop, Integer cantidadp,
                               Double valor_u, Double valor_t) {
        long id_r = 0;
        try {

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nombrep", nombrep);
        values.put("codigop", codigop);
        values.put("cantidadp", cantidadp);
        values.put("valor_u", valor_u);
        values.put("valor_t", valor_t);

        id_r = db.insert(TABLE_VENTAS, null, values);
    } catch (Exception ex){
            ex.toString();
        }
        return id_r;
    }

    public ArrayList<Ventas> mostrarventas(){

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<Ventas> listaventas = new ArrayList<>();
        Ventas ventas = null;
        Cursor cursorventas = null;

        cursorventas = db.rawQuery("SELECT * FROM " + TABLE_VENTAS, null);

        if (cursorventas.moveToFirst()){
            do{
                ventas = new Ventas();
                ventas.setNombrep(cursorventas.getString(0));
                ventas.setCodigop(cursorventas.getInt(1));
                ventas.setCantidadp(cursorventas.getInt(2));
                ventas.setValoru(cursorventas.getDouble(3));
                ventas.setValort(cursorventas.getDouble(4));
                listaventas.add(ventas);
            } while (cursorventas.moveToNext());
        }

        cursorventas.close();

        return listaventas;
    }

}

