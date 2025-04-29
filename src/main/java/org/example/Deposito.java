package org.example;

import java.util.ArrayList;

/**
 * Clase genérica deposito.
 * @param <T> tipo de objetos en depósito.
 */
class Deposito<T> {
    private ArrayList<T> items;

    /**
     * Constructor para depósito vacío.
     */
    public Deposito() {
        this.items = new ArrayList<>();
    }

    /**
     * Agrega un elemento al depósito.
     * @param item a agregar.
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Obtiene un elemento del depósito.
     * @return El primer elemento del depósito o null si está vacío.
     */
    public T getItem() {
        if (items.isEmpty()) {
            return null;
        } else {
            return items.remove(0);
        }
    }
}
