package org.example;

/**
 * Clase que representa el dulce Snicker.
 * Hereda de la clase abstracta Dulce.
 */
public class Snickers extends Dulce {

    /**
     * Sabor del dulce Snickers (redeclara el campo heredado).
     */
    private String sabor;

    /**
     * Constructor de la clase Snickers.
     *
     * @param codigo, Codigo del producto.
     * @param nombre, Nombre del producto.
     * @param precio, Precio del producto.
     * @param sabor,  Sabor del dulce.
     */
    public Snickers(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, Precios.SNICKERS.getPrecio(), sabor);
        this.sabor = sabor;
    }

    /**
     * Describe el consumo del dulce Snickers.
     *
     * @return Cadena que indica el consumo de Snicker y su sabor.
     */
    @Override
    public String consumirP() {
        return "Consumiendo " + this.sabor;
    }
}