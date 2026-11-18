package servicios;

public class SaludoLocal implements Saludo {
    @Override
    public String saludar(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        return "Hola, " + nombre + "!";
    }
}
