package com.example.myapplication.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "r_ventas";
    public static final String TABLE_VENTAS = "t_ventas";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);

        }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_VENTAS + "(" +
                "id_r INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombrep TEXT NOT NULL," +
                "codigop INTEGER NOT NULL," +
                "cantidadp INTEGER NOT NULL," +
                "valor_u REAL NOT NULL," +
                "valor_t REAL NOT NULL)");

    }

    /*este metodo se crea en caso de otra version, borra y crea nuevamente la tabla  */

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_VENTAS);
        onCreate(sqLiteDatabase);

    }


}
