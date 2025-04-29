package org.example;

public class Sprite extends Bebida{
    private String marca;
    public Sprite(int codigo, String nombre, int precio, String marca){
        super(codigo, nombre, precio, marca);
        this.marca = marca;
    }

    public String consumirP(){
        return "Bebiendo " + this.marca;
    }
}