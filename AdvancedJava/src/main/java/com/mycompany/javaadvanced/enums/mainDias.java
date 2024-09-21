/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.enums;

import java.util.Arrays;

/**
 *
 * @author Erick
 */
public class mainDias {
    public static void main(String[] args) {
        /*
        O metodo abaixo retorna a string atribuida a constante do enum
        No caso abaixo, o valor atribuido a "SEGUNDA" é "segunda-feira".
        
        */
        String a = DiaDaSemana.SEGUNDA.getPalavra();
        /*
        O metodo abaixo atribui um dos valores do enum a uma 
        variavel do tipo do enum
        */
        DiaDaSemana aM = DiaDaSemana.valueOf("segunda");
        System.out.println(a);
        System.out.println(Arrays.toString(DiaDaSemana.values()));
        /*
        O metodo abaixo retorna a posição do da constante do enum na lista 
        de enums. Neste caso, retornará o valor 6.
        */
        System.out.println(DiaDaSemana.DOMINGO.ordinal());
        System.out.println(aM);
    }
}
