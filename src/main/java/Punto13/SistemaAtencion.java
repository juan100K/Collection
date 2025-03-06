package Punto13;

import java.util.PriorityQueue;

public class SistemaAtencion {
    private PriorityQueue<Paciente> cola;

    public SistemaAtencion() {
        cola = new PriorityQueue<>();
    }

    public void ingresarPaciente(Paciente paciente) {
        cola.offer(paciente);
    }

    public String atenderPaciente() {
        if (!cola.isEmpty()) {
            Paciente paciente = cola.poll();
            return paciente.getNombre();
        } else {
            return "No hay pacientes en espera.";
        }
    }
}
