package org.example;

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito monVu;
    private int precio;
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new Deposito();
        precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if (m == null){
            return null;
        }

        if (cual !=1 && cual !=2){
            monVu.addMoneda(m);
            return null;
        }

        if (m.getValor() >= precio){
            Bebida b = null;

            if (cual == COCA){
                b = coca.getBebida();
                if (b == null){
                    monVu.addMoneda(m);
                    return null;
                }
            }
            else if(cual == SPRITE){
                b = sprite.getBebida();
                if (b == null){
                    monVu.addMoneda(m);
                    return null;
                }
            }

            int cambio = m.getValor() - precio;
            if (cambio >= 100){
                for (int i=0; i<cambio; i+=100){
                    monVu.addMoneda(new Moneda100());
                }
            }
            return b;
        }
        else{
            monVu.addMoneda(m);
            return null;
        }
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
