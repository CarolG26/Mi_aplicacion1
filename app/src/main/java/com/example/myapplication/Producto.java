package com.example.myapplication;

import java.io.Serializable;

public class Producto implements Serializable {
    private String nombrep;
    private String tipop;
    private int cantidadp;
    private double preciocomp;
    private double preciovenp;

    public Producto(String nombrep, String tipop, int cantidadp, double preciocomp, double preciovenp) {
        this.nombrep = nombrep;
        this.tipop = tipop;
        this.cantidadp = cantidadp;
        this.preciocomp = preciocomp;
        this.preciovenp = preciovenp;
    }

    public String getNombrep(){
        return nombrep;
    }

    public void setNombrep(String nombrep){
        this.nombrep = nombrep;
    }

    public String getTipop(){
        return tipop;
    }

    public void setTipop(String tipop){
        this.tipop = tipop;
    }

    public int getCantidadp(){
        return cantidadp;
    }

    public void setCantidadp(int cantidadp){
        this.cantidadp = cantidadp;
    }

    public double getPreciocomp(){
        return preciocomp;
    }

    public void setPreciocomp(double preciocomp){
        this.preciocomp = preciocomp;
    }

    public double getPreciovenp(){
        return preciovenp;
    }

    public void setPreciovenp(double preciovenp){
        this.preciovenp = preciovenp;
    }
}
