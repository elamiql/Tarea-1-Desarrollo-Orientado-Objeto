package org.example;

public class Snickers extends Dulce{
    private String sabor;

    public Snickers(int codigo, String nombre, int precio, String sabor){
        super(codigo, nombre, Precios.SNICKERS.getPrecio(), sabor);
    }

    @Override
    public String consumirP() {
        return "Consumiendo " + this.sabor;
    }
}
