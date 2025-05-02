package org.example;

/**
 * Clase que representa la bebida CocaCola.
 * Extiende la clase abstracta Bebida.
 */
public class CocaCola extends Bebida {

    /**
     * Marca de la bebida
     */
    private String marca;

    /**
     * Constructor de la clase CocaCola.

     * @param codigo, CÃ³digo del producto.
     * @param nombre, Nombre del producto.
     * @param precio, precio del producto.
     * @param marca,  Marca de la bebida.
     */
    public CocaCola(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, Precios.COCA_COLA.getPrecio(), marca);
        this.marca = marca;
    }

    /**
     * Describe el consumo de la bebida CocaCola.
     *
     * @return Una cadena que indica el consumo de CocaCcola.
     */
    @Override
    public String consumirP() {
        return "Bebiendo " + this.marca;
    }
}