/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Exceptions;

/**
 *
 * @author Erick
 */
public class Lançamento {
    
    
    public static void main(String[] args) throws NumeroNegativo {
     java.util.Scanner  entrada = new java.util.Scanner(System.in);
        System.out.println("\n\tEntre com um número:");
         int numero = entrada.nextInt();
        if(numero <0){
            throw new NumeroNegativo ("Não pode ser negativo");
        }
    }
}
