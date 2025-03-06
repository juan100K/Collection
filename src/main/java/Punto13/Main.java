package Punto13;

public class Main {
    public static void main(String[] args) {
        SistemaAtencion sistema = new SistemaAtencion();


        sistema.ingresarPaciente(new Paciente("Juan", 2));
        sistema.ingresarPaciente(new Paciente("Ana", 1));
        sistema.ingresarPaciente(new Paciente("Luis", 3));


        System.out.println(sistema.atenderPaciente());
        System.out.println(sistema.atenderPaciente());
        System.out.println(sistema.atenderPaciente());
    }
}