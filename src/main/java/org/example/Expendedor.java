package org.example;

import java.util.ArrayList;
import java.util.List;

public class Expendedor{

    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    public static final int SUPER8 = 4;
    public static final int SNICKERS = 5;

    private Deposito<Moneda> monedasVuelto;
    private List<Deposito<Producto>> productos;



    public Expendedor(int numProductos) {
        productos = new ArrayList<>();
        monedasVuelto = new Deposito<>();

        for (int i=0; i < 5; i++){
            productos.add(new Deposito<Producto>());
        }

        for (int i = 0; i < numProductos; i++) {
            productos.get(COCA - 1).addItem(new CocaCola(i, "CocaCola", Precios.COCA_COLA.getPrecio(), "CocaCola"));
            productos.get(SPRITE - 1).addItem(new Sprite(i, "Sprite", Precios.SPRITE.getPrecio(), "Sprite"));
            productos.get(FANTA - 1).addItem(new Fanta(i, "Fanta", Precios.FANTA.getPrecio(), "Fanta"));
            productos.get(SUPER8 - 1).addItem(new Super8(i,"Super8",Precios.SUPER8.getPrecio(),"Chocolate"));
            productos.get(SNICKERS - 1).addItem(new Snickers(i,"Snickers",Precios.SNICKERS.getPrecio(),"Snicker"));
        }


    }

    public Producto comprarProducto(Moneda m, int cual) {
        if (m == null){
            return null;
        }

        if (cual < COCA || cual > SNICKERS){
            return null;
        }

        int precioProductos = Precios.values()[cual-1].getPrecio();

        Deposito<Producto> depositoProducto = productos.get(cual-1);

        int valMoneda = m.getValor();
        int cambio = valMoneda - precioProductos;

        while (cambio >= 100){
            monedasVuelto.addItem(new Moneda100());
            cambio = cambio - 100;
        }

        return depositoProducto.getItem();
    }

    public Moneda getVuelto(){
        return monedasVuelto.getItem();
    }
}
