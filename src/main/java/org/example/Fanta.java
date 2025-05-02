package org.example;

/**
 * Clase que representa la bebida fanta.
 * Extiende la clase abstracta Bebida.
 */
public class Fanta extends Bebida {

    /**
     * Marca de la bebida.
     */
    private String marca;

    /**
     * Constructor de la clase Fanta.
     * @param codigo ,CÃ³digo del producto.
     * @param nombre ,Nombre del producto.
     * @param precio , Precio del producto.
     * @param marca  ,Marca de la bebida.
     */
    public Fanta(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, Precios.FANTA.getPrecio(), marca);
        this.marca = marca;
    }

    /**
     * Describe el consumo de la bebida Fanta.
     *
     * @return Una cadena que inda consumo de Fanta..
     */
    @Override
    public String consumirP() {
        return "Bebiendo " + this.marca;
    }
}