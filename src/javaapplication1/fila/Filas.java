/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.fila;
import java.util.*;
/**
 *
 * @author Erick
 */
public class Filas {
    public static void main(String... varargs) {
        Queue <String> fila = new LinkedList <>();
        List <String> novosElementos = Arrays.asList("Banana","Uva","Maracujá", "Abóbora", "Kiwi", "Tamarindo");
        fila.addAll(novosElementos);
        System.out.println("Fila inicial:" + fila);
        System.out.println("Primeiro elemento da esquerda para a direita: " + fila.peek());
        System.out.println("Elemento a ser removido:" + fila.poll());
        System.out.println("Fila após remoção do elemento: " + fila);
    }
}
