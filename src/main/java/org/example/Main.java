package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(6,200);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
    }
}

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

abstract class Bebida{
    private int serie;

    public Bebida(int ser){
        this.serie = ser;
    }
    public int getSerie(){
        return serie;
    }

    public abstract String beber();
}

class CocaCola extends Bebida{

    public CocaCola(int serie){
        super(serie);
    }

    public String beber(){
        return "cocacola";
    }
}

class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }

    public String beber(){
        return "sprite";
    }
}

class Deposito{
    private ArrayList<Bebida> var;
    private ArrayList<Moneda> mon;

    public Deposito(){
        this.var = new ArrayList<>();
        this.mon = new ArrayList<>();
    }

    public void addBebida(Bebida b){
        var.add(b);
    }

    public Bebida getBebida() {
        if (var.size() == 0) {
            return null;
        } else {
            return var.remove(0);
        }
    }

    public void addMoneda(Moneda m){
        mon.add(m);
    }

    public Moneda getMoneda() {
        if (mon.size() == 0) {
            return null;
        } else {
            return mon.remove(0);
        }
    }
}

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

abstract class Moneda{
    public Moneda(){}

    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();
}

class Moneda1500 extends Moneda {
    public Moneda1500(){
        super();
    }

    public int getValor() {
        return 1500;
    }
}

class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }

    public int getValor(){
        return 1000;
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }

    public int getValor(){
        return 500;
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
}