/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.fila;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringJoiner;
/**
 *
 * @author Erick
 */
public class Filas {
    public static void main(String... varargs) throws InstantiationException, IllegalAccessException {
        Queue <String> fila = new LinkedList <>(Arrays.asList("Banana","Uva","Maracujá", "Abóbora", "Kiwi", "Tamarindo"));
        System.out.println("Primeiro elemento da esquerda para a direita: " + fila.peek());
        System.out.println("Elemento a ser removido:" + fila.poll());
        System.out.println("Fila após remoção do elemento: " + fila);
        
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("ola").add("add");
        System.out.println(joiner);
    
    }
}
