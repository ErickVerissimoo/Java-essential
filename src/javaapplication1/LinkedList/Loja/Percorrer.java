/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Erick
 */
public class Percorrer {

    public static void main(String[] args) { 
             @SuppressWarnings ("unchecked")
        List <Integer> ligada = new LinkedList<>();
        List <Integer> array = new ArrayList<>();
        long inicio1 = System.nanoTime();
        for(int i = 0; i<10000000; i++){
            array.add(i);
        }
        long final1 = System.nanoTime();
        long tempo = inicio1 - final1;
        System.out.println(tempo);
        long inicio2 = System.nanoTime();
        for(int x = 0; x<10000000;x++){
            ligada.addLast(x);
        }
        long final2 = System.nanoTime();
        long resultado = inicio2 - final2;
        System.out.println(resultado);
    }
}
