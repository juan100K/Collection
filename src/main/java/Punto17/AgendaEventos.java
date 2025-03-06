package Punto17;

import java.time.LocalDate;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<LocalDate, String> eventos;

    public AgendaEventos() {
        eventos = new TreeMap<>();
    }

    public void agregarEvento(LocalDate fecha, String evento) {
        eventos.put(fecha, evento);
    }


    public String obtenerEventoProximo() {
        return eventos.isEmpty() ? "No hay eventos programados." : eventos.firstEntry().getValue();
    }

    public void mostrarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos programados.");
            return;
        }

        System.out.println("Eventos programados:");
        for (LocalDate fecha : eventos.keySet()) {
            System.out.printf("%s: %s%n", fecha, eventos.get(fecha));
        }
    }
}
