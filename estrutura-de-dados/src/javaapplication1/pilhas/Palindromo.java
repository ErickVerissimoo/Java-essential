/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.pilhas;

import java.util.Scanner;


/**
 *
 * @author Erick
 */
//()
public class Palindromo {
    public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
        System.out.println("Entre com uma palavra:");
        String palavra = entrada.next();
        char [] comparaction = new char [palavra.toCharArray().length]; 
        int auxiliar =0;
        for(int i = palavra.length() - 1; i>=0; i--){
           
                comparaction[auxiliar++]=palavra.charAt(i);
            }
       
        String palavrafinal = new String (comparaction);
       if(palavrafinal.equals(palavra)){
           System.out.println("é um palindromo");
       }
       else{
           System.out.println("não é um palindromo");
       }
        
             
      
       }
    }

