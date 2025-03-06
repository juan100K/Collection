package Punto17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();


        agenda.agregarEvento(LocalDate.of(2025, 3, 10), "Reunión de equipo");
        agenda.agregarEvento(LocalDate.of(2025, 3, 5), "Cita médica");
        agenda.agregarEvento(LocalDate.of(2025, 3, 15), "Cumpleaños de Ana");


        agenda.mostrarEventos();


        System.out.println("Evento más próximo: " + agenda.obtenerEventoProximo());
    }
}