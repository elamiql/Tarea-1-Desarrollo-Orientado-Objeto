package org.example;

public abstract class Bebida extends Producto{
    private String marca;

    public Bebida(int serie, String nombre, int precio, String marca){
        super(serie, nombre, precio);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public abstract String consumirP();
}
