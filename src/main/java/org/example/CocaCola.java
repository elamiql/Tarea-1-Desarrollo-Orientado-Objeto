package org.example;

public class CocaCola extends Bebida{
    private String marca;

    public CocaCola(int codigo, String nombre, int precio, String marca){
        super(codigo, nombre, Precios.COCA_COLA.getPrecio(), marca);
        this.marca = marca;
    }

    public String consumirP(){
        return "Bebiendo "+ this.marca;
    }
}

