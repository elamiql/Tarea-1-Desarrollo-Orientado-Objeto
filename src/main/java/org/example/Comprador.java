package org.example;

class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida bebida;
        bebida = exp.comprarBebida(m, cualBebida);

        if (bebida != null) {
            this.sonido = bebida.beber();
        } else {
            this.sonido = null;
        }
        this.vuelto = 0;

        Moneda moneda;
        while ((moneda = exp.getVuelto()) != null) {
            this.vuelto += moneda.getValor();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }
}

