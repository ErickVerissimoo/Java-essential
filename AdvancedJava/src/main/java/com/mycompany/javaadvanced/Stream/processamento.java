/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;
import static java.util.Arrays.*;
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author Erick
 */
public class processamento {
    public static void main(String[] args) {
        List <Double> lista = asList(21.3, 11.4, 
                11.1,11.0, 13.3, 44.4, 212.2);
        Stream <Double> filtrar = lista.stream();
        long has = filtrar.hashCode();
        System.out.println(lista.hashCode());
        
      
    }
}
