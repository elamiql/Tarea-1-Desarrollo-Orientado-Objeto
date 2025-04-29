package org.example;

public enum Precios{
    COCA_COLA(1000),
    SPRITE(800),
    FANTA(800),
    SUPER8(400),
    SNICKERS(400);

    private final int precio;

    Precios(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}

