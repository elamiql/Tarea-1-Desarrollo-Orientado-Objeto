package org.example;

import java.util.ArrayList;

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

