/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Numbers;

/**
 *
 * @author Erick
 */
public class Integers {
    public static <T> void print(T argumento){
        System.out.printf("    %s%n",argumento);
    }
    
    public static void main(String[] args) {
        String numero = "10";
        
        int [] vares = new int[100];
        /*
        Retorna o sinal do numero. 1 se o numero for positivo,
        -1 se for negativo e 0 se for igual a 0
        */
        vares[0] = Integer.signum(-3);
        print(vares[0]);
        
        /*
        O método valueOf  converte uma
        string que representa um número inteiro em um objeto 
        Integer. Se a string for um número
        válido, ele retorna um objeto Integer correspondente
        */
        var value = Integer.valueOf(numero);
        
        
        /*
        Retorna um tipo primitivo do tipo int
        */
        var number = Integer.parseInt(numero);
        /*
        Retorna uma divisão, onde a esquerda se 
        encontra o numero a ser dividido e a direita
        o numero que irá dividir, o divisor.
        */
        var e = Integer.divideUnsigned(number, 3);
        /*
        Transforma uma String para uma wrapper class do 
        tipo Integer
        */
        var test = Integer.decode(numero);
        // Retorna o numero unicode da posição especificada
        var ed = numero.codePointAt(1);
        // Soma dois numeros
        var a = Integer.sum(2, 2);
        /*
        Retorna 0 se x for maior que y, um valor
        maior que 0 se x for maior que y ou um valor
        menor que 0 se y for maior que x
        */
        var comparar = Integer.compareUnsigned(2, 0);
        print(comparar);
        
        
        print(numero);
        
        print(test);
        print(e);
        print(number);
        print(ed);
        print(a);
    }
}
