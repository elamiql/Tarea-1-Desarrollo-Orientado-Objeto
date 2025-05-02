package org.example;

import java.util.Scanner;

public class MainInteractive {
    public static void main(String[] args) {
        boolean salir = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Expendedor Interactivo!");
        System.out.println("¿Desea comprar un producto?");
        System.out.println("1. Sí");
        System.out.println("2. No");

        int respuesta = scanner.nextInt();


        if (respuesta != 1) {
            System.out.println("Hasta luego :)");
            scanner.close();
            return;
        }

        Expendedor expendedor = new Expendedor(5);  // Inicializa con 5 productos de cada tipo

        Moneda m = null;
        Comprador comprador;
        String[] nombresProductos = {"CocaCola", "Sprite", "Fanta", "Super8", "Snickers"};

        while(salir){
            System.out.println("Ingrese una moneda");
            System.out.println("1. 100$");
            System.out.println("2. 500$");
            System.out.println("3. 1000$");
            System.out.println();

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
                    System.out.println("Eleccion no valida");

            }
            System.out.println("Elija un producto:");
            System.out.println("1. Coca");
            System.out.println("2. Sprite");
            System.out.println("3. Fanta");
            System.out.println("4. Super8");
            System.out.println("5. Snickers");

            eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    try {
                        comprador = new Comprador(m, 1, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[0]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[0] + ": " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        comprador = new Comprador(m, 2, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[1]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[1] + ": " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        comprador = new Comprador(m, 3, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[2]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[2] + ": " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        comprador = new Comprador(m, 4, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[3]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[3] + ": " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        comprador = new Comprador(m, 5, expendedor);
                        System.out.println("Comprador compró: " + nombresProductos[4]);
                        System.out.println(comprador.queBebiste());
                        System.out.println("Vuelto del comprador: " + comprador.cuantoVuelto() + "\n");
                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
                        System.out.println("Error al comprar " + nombresProductos[4] + ": " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Error en la eleccion");
            }
            
            System.out.println("¿Quieres seguir comprando?");
            System.out.println("1. Si");
            System.out.println("2. No");
            eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    break;
                case 2:
                    salir=false;
                    break;
            }
        }
        System.out.println("Hasta luego");
        scanner.close();
    }
}
