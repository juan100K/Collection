package Punto1;

import javax.swing.*;
import java.util.TreeSet;

public class Empresa {

    public static void main(String[] args) {
        TreeSet<Producto>treeSet= new TreeSet<>();
        Producto p1=new Producto("Lata","1");
        Producto p2=new Producto("Lapiz","13");
        treeSet.add(p1);
        treeSet.add(p2);
        String codigo= JOptionPane.showInputDialog("Codigo");

        if(buscarProducto(codigo,treeSet)){
            System.out.println("ESTA");
        }else {
            System.out.println("ENCONTRADO");
        }
    }

    private static boolean buscarProducto(String codigo, TreeSet<Producto> treeSet) {
        for(Producto c:treeSet){
            if(codigo.equalsIgnoreCase(c.getCodigo())){
                System.out.println(c.getNombre());
               return true;
            }

        }
        return false;

    }
}
