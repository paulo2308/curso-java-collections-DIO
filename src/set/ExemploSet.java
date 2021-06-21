package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args){
        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9d, 5d, 3.6, 4d, 7d));
        System.out.println(notas);
        System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5d));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba as notas na ordem em que foram inseridas");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9d, 5d, 3.6, 4d, 7d));
        System.out.println(notas2);
        
        Set<Double> notas3 = new LinkedHashSet<>();
        notas3.add(7d);
        notas3.add(8.5);
        notas3.add(9d);
        notas3.add(5d);
        notas3.add(3.6);
        notas3.add(4d);
        notas3.add(7d);
        System.out.println(notas3);
        
        System.out.println("Exiba as notas em ordem crescente");
        Set<Double> notas4 = new TreeSet<>(Arrays.asList(7d, 8.5, 9d, 5d, 3.6, 4d, 7d));
        System.out.println(notas4);
        
        Set<Double> notas5 = new TreeSet<>(notas2);
        System.out.println(notas5);
        //System.out.println();
    }
}