package Punto3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<Automovil>autos=new HashSet<>();

        Automovil auto= new Automovil("Chevrolet", "2016");
        Automovil auto2= new Automovil("Chevrolet", "2016");

        autos.add(auto);
        autos.add(auto2);
        Iterator<Automovil> it = autos.iterator();
        Automovil num;
        while (it.hasNext()){
            num = it.next();
            System.out.println(num);
        }

    }
}
