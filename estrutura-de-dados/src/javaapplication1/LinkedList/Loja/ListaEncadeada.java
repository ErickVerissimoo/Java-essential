/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
/**
 *
 * @author Erick
 */
public class ListaEncadeada {
    public static void main(String[] args) {
        /*
        Em termos de inserção de dados e desempenho, uma lista encadeada perde 
        para um arrayList
        */
        LinkedList <String> lista = new LinkedList<>();
        ArrayList <String> lista2 = new ArrayList<>();
        long Startime = System.nanoTime();
        lista.addFirst("a");
        long EndTime = System.nanoTime();
        long duraction = EndTime - Startime;
        System.out.println(duraction);
         long Startime2 = System.nanoTime();
        lista2.add("a");
        long EndTime2 = System.nanoTime();
        long duraction2 = EndTime2 - Startime2;
        System.out.println(duraction2);
        Vector<String> vetor = new Vector<>();
        
    }
}
