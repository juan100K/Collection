package Punto16;

import java.util.LinkedHashMap;

public class Supermercado {
    private LinkedHashMap<String, Double> productos;

    public Supermercado() {
        productos = new LinkedHashMap<>();
    }


    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
    }


    public double calcularTotal() {
        double total = 0.0;
        for (double precio : productos.values()) {
            total += precio;
        }
        return total;
    }


    public void mostrarFactura() {
        System.out.println("Factura:");
        for (String nombre : productos.keySet()) {
            System.out.printf("%s: $%.2f%n", nombre, productos.get(nombre));
        }
        System.out.printf("Total: $%.2f%n", calcularTotal());
    }
}