/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.*;
import java.util.ArrayList;
/**
 *
 * @author Erick
 */
public class lista {
    public static void main(String[] args) {
        long inicio1 = System.nanoTime();
        List<Integer> listaligada = new LinkedList<Integer>(asList(1, 3, 5, 32, 21, 54, 23));
        System.out.println("\n\tLinkedLists:");
        listaligada.stream().forEach(System.out::println);
        System.out.println("-----------------------");
        listaligada.add(4, 321);
        listaligada.stream().forEach(System.out::println);
        long final1 = System.nanoTime();
        long resultado = inicio1 - final1;
        System.out.println(resultado);
        long inicio2  = System.nanoTime();
        List<Integer> array = new ArrayList<>(asList(1, 3, 5, 32, 21, 54, 23));
        System.out.println("\n\n\tArrayList");
        array.stream().forEach(System.out::println);
        System.out.println("-----------------------");
        array.add(4, 321);
        array.stream().forEach(System.out::println);
        long final2 = System.nanoTime();
        long resultado2 = inicio2 - final2;
        System.out.println(resultado2);
    }
}
