package org.example;

public class Fanta extends Bebida{
    private String marca;

    public Fanta(int codigo, String nombre, int precio, String marca){
        super(codigo, nombre, Precios.FANTA.getPrecio(), marca);
        this.marca = marca;
    }

    public String consumirP(){
        return "Bebiendo " + this.marca;
    }
}
