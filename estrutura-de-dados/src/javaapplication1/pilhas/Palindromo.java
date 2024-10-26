/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.pilhas;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 *
 * @author Erick
 */
//()
public class Palindromo {
    public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
    String palavra = entrada.next();
    List <Character> palabra = palavra.chars().mapToObj((c -> (char) c)).collect(Collectors.toList());
    Collections.reverse(palabra);
    String palavrai = palabra.parallelStream().map(String::valueOf).collect(Collectors.joining());
    
    if(palavra.equals(palavrai)){
        System.out.print("É um palindromo");
    }
    else{
        System.out.print("Não é um palindromo");
    }
    }

}

