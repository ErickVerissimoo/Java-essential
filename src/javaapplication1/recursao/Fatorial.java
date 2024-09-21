/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.recursao;

/**
 *
 * @author Erick
 */
public class Fatorial {
   public static int fatorial(int numero){
       if(numero==1){
           return 1;
       }
 
       return (numero * fatorial (numero-1));

   }
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
}
