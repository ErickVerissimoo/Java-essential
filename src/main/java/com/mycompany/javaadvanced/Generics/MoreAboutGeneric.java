/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Generics;

/**
 *
 * @author Erick
 */
public class MoreAboutGeneric {
    
    public static <T extends Number> void voltar(T numero){
       
        System.out.println(numero); 
    }
    
    public static <E extends String> void voltar(E frase){
        System.out.print(frase);
    }
    
}
