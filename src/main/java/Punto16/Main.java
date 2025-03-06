package Punto16;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();


        supermercado.agregarProducto("Manzanas", 1.50);
        supermercado.agregarProducto("Leche", 0.99);
        supermercado.agregarProducto("Pan", 2.50);
        supermercado.agregarProducto("Huevos", 3.00);


        supermercado.mostrarFactura();
    }
}