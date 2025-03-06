package Punto14;

import java.util.ArrayDeque;

public class HistorialMensajes {
    private ArrayDeque<String> mensajes;
    private static final int LIMITE_MENSAJES = 10;

    public HistorialMensajes() {
        mensajes = new ArrayDeque<>();
    }

    public void enviarMensaje(String mensaje) {
        mensajes.addLast(mensaje);


        if (mensajes.size() > LIMITE_MENSAJES) {
            mensajes.removeFirst();
        }
    }

    public void mostrarHistorial() {
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }
}