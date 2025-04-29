package org.example;

public class Super8 extends Dulce{
    private String sabor;

    public Super8(int codigo, String nombre, int precio, String sabor){
        super(codigo, nombre, Precios.SUPER8.getPrecio(), sabor);
        this.sabor = sabor;
    }

    public String consumirP(){
        return "Comiendo " + this.sabor;
    }
}