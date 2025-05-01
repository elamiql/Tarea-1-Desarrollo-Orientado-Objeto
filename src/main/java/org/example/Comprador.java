package org.example;

public class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        Producto producto;
        producto = exp.comprarProducto(m, cualProducto);

        if (producto != null) {
            sonido = producto.consumirP();
        } else {
            sonido = null;
        }

        vuelto = 0;
        Moneda moneda;
        moneda = exp.getVuelto();
        while (moneda != null) {
            vuelto += moneda.getValor();
            moneda = exp.getVuelto();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }
}

