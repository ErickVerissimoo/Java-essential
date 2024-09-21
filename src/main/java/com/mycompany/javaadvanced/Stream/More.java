/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;
/**
 *
 * @author Erick
 */
public class More {

    public static void main(String[] args) {
        var lista= Arrays.asList(1.0, 3.2, 9.5, 2.4, 7.8, 9.7, 12.3, 15.1, 17.4);
        lista.stream().filter(x -> x > 10).forEach(System.out::println);  
        Stream <Double> numberos = lista.stream();
        
       
        
        numberos.forEach(x -> System.out.println(x/2));
        
        System.out.println(lista.stream().count());
    
    }
}
