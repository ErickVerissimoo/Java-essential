/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Erick
 */
public class iterator {

    public static void main(String[] args) {
        java.util.ArrayList<String> lista = new java.util.ArrayList<>();
        List a = Arrays.asList("Generico", "carro", "bolo", "macaco", "elefante");
        lista.addAll(a);
        /*
        Iterators são uma forma mais sofisticada de percorrer estruturas 
        de dados, pois fornecem métodos úteis para percorrer a lista como 
        hastNext qu retorna um booleano indicando se a estrutura contém ou 
        não próximo elemento, o método next que retorna o elemento, o método
        forEachRemaining que aceita um consumer na qual permite realizar uma 
        ação para cada elemento e por fim o método remove que remove um elemento
        */
        Iterator<String> iterar = lista.iterator();
        while (iterar.hasNext()) {
     
       System.out.println(iterar.next());
         
            
        }}
    }

