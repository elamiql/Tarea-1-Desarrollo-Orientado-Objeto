package org.example;

abstract class Bebida{
    private int serie;

    public Bebida(int ser){
        this.serie = ser;
    }
    public int getSerie(){
        return serie;
    }

    public abstract String beber();
}
