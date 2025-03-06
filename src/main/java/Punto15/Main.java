package Punto15;

public class Main {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();


        directorio.agregarContacto("Juan Pérez", "555-1234");
        directorio.agregarContacto("Ana Gómez", "555-5678");
        directorio.agregarContacto("Luis Martínez", "555-8765");


        System.out.println("Número de Juan Pérez: " + directorio.buscarNumero("Juan Pérez"));
        System.out.println("Número de María López: " + directorio.buscarNumero("María López")); // No existe


        System.out.println("\nContactos en el directorio:");
        directorio.mostrarContactos();
    }
}