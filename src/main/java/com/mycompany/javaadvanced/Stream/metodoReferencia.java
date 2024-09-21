/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;

/**
 *
 * @author Erick
 */
public class metodoReferencia {
     void metodos(){
            System.out.print("ola mundo");
    }
     @FunctionalInterface
     static interface aleatorio {
         void passagem();
     }
     public static void main(String[] args) {
         metodoReferencia metodo = new metodoReferencia();
          aleatorio e = metodo::metodos;
          e.passagem();
     }
}
