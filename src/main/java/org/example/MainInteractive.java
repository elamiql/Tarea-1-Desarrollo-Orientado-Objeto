package org.example;

import java.util.Scanner;

public class MainInteractive {
    public static void main(String[] args) {
        boolean salir = true;
        Scanner scanner = new Scanner(System.in);
        int cant = scanner.nextInt();
        Expendedor expendedor = new Expendedor(cant);
        Moneda m = null;
        Comprador comprador;
        String[] nombresProductos = {"CocaCola", "Sprite", "Fanta", "Super8", "Snickers"};
        while(salir){
            System.out.println("ingrese una moneda");
            System.out.println("1. 100$");
            System.out.println("2. 500$");
            System.out.println("3. 1000$");
            int eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    m = new Moneda100();
                    break;
                case 2:
                    m = new Moneda500();
                    break;
                case 3:
                    m = new Moneda1000();
                    break;
                default:
                    System.out.println("eleccion no valida");

            }
            System.out.println("elija un producto");
            System.out.println("1. Coca");
            System.out.println("2. Sprite");
            System.out.println("3. Fanta");
            System.out.println("4. super8");
            System.out.println("5. snickers");
            eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    try {
                        comprador = new Comprador(m, 1, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[1]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[1] + ": " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        comprador = new Comprador(m, 2, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[2]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[2] + ": " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        comprador = new Comprador(m, 3, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[3]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[3] + ": " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        comprador = new Comprador(m, 4, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[4]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[4] + ": " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        comprador = new Comprador(m, 5, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[5]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[5] + ": " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("error en la eleccion");
            }
            
            System.out.println("salir?");
            System.out.println("1. no salir");
            System.out.println("2. salir");
            eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    break;
                case 2:
                    salir=false;
                    break;
            }
            scanner.close();
        }
    }
}
