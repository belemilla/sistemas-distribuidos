package app;

import servicios.Saludo;
import servicios.SaludoLocal;

public class Principal {
    public static void main(String[] args) {
        Saludo servicio = new SaludoLocal();

        // Prueba 1: Caso normal
        try {
            System.out.println(servicio.saludar("Ana"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Prueba 2: Caso de excepción
        try {
            System.out.println(servicio.saludar(""));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El programa continúa");
    }
}
