package Punto14;

public class Main {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();


        for (int i = 1; i <= 15; i++) {
            historial.enviarMensaje("Mensaje " + i);
        }


        System.out.println("Últimos mensajes enviados:");
        historial.mostrarHistorial();
    }
}