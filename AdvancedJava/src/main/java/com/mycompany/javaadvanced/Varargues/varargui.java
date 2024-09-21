/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Varargues;

/**
 *
 * @author Erick
 */


public class varargui {

    public static void vare(String... argumentos){
        for(String arg : argumentos){
            System.out.println(arg); 
       }
    }
    
    public static void main(String[] args) {
        vare("banana", "nescau", "bolovo");
    }
}
