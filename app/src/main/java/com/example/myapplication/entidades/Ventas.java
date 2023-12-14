package com.example.myapplication.entidades;

public class Ventas {

    private int id_r;
    private String nombrep;
    private int codigop;
    private int cantidadp;
    private double valor_u;
    private double valor_t;

    public int getId_r() {
        return id_r;
    }

    public void setId_r(int id_r) {
        this.id_r = id_r;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public int getCodigop() {
        return codigop;
    }

    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }

    public int getCantidadp() {
        return cantidadp;
    }

    public void setCantidadp(int cantidadp) {
        this.cantidadp = cantidadp;
    }

    public double getValoru() {
        return valor_u;
    }

    public void setValoru(double valor_u) {
        this.valor_u = valor_u;
    }

    public double getValort() {
        return valor_t;
    }

    public void setValort(double valor_t) {
        this.valor_t = valor_t;
    }
}