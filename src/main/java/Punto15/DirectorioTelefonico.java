package Punto15;

import java.util.HashMap;

public class DirectorioTelefonico {
    private HashMap<String, String> directorio;

    public DirectorioTelefonico() {
        directorio = new HashMap<>();
    }


    public void agregarContacto(String nombre, String numero) {
        directorio.put(nombre, numero);
    }


    public String buscarNumero(String nombre) {
        return directorio.getOrDefault(nombre, "Contacto no encontrado.");
    }


    public void mostrarContactos() {
        for (String nombre : directorio.keySet()) {
            System.out.println("Nombre: " + nombre + ", Número: " + directorio.get(nombre));
        }
    }
}