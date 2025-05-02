package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear expendedor con 1 unidad de cada producto para forzar errores luego
        Expendedor expendedor = new Expendedor(1);

        // Monedas
        Moneda moneda1000 = new Moneda1000(); // Suficiente
        Moneda moneda500 = new Moneda500();   // Insuficiente para CocaCola
        Moneda moneda100 = new Moneda100();   // insuficiente
        System.out.println("\n=== PRUEBA: COMPARACIÓN DE MONEDAS ===");

        System.out.println("Comparando moneda1000 con moneda500: " + moneda1000.compareTo(moneda500));
        

        System.out.println("Comparando moneda500 con moneda1000: " + moneda500.compareTo(moneda1000));


        System.out.println("Comparando moneda500 con otra moneda500: " + moneda500.compareTo(new Moneda500()));


        System.out.println("Comparando moneda100 con moneda1000: " + moneda100.compareTo(moneda1000));


        // Productos válidos
        int[] productos = {
                Expendedor.COCA,
                Expendedor.SPRITE,
                Expendedor.FANTA,
                Expendedor.SUPER8,
                Expendedor.SNICKERS
        };

        System.out.println("=== PRUEBAS DE COMPRA EXITOSA ===");
        for (int i = 0; i < productos.length; i++) {
            try {
                Comprador comprador = new Comprador(moneda1000, productos[i], expendedor);
                System.out.println("Comprador: " + comprador.queBebiste());
                System.out.println("Vuelto: " + comprador.cuantoVuelto() + "\n");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        System.out.println("=== PRUEBA: MONEDA NULA ===");
        try {
            Comprador comprador = new Comprador(null, Expendedor.COCA, expendedor);
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA: MONEDA INSUFICIENTE ===");
        try {
            Comprador comprador = new Comprador(moneda500, Expendedor.COCA, expendedor);
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA: PRODUCTO INEXISTENTE ===");
        try {
            Comprador comprador = new Comprador(moneda1000, 10, expendedor); // No existe producto 10
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA: PRODUCTO AGOTADO ===");
        try {
            // Ya se compró un Snickers arriba, y solo había 1
            Comprador comprador = new Comprador(moneda1000, Expendedor.SNICKERS, expendedor);
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}
