/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.Console;

/**
 *
 * @author Erick
 */
public class consoli {
    public static void main(String[] args) {
        /*
        A classe console é feita para trabalhar com
        linha de comando via terminal, pois
        fornece métodos úteis como por exemplo
        readPassword, escondendo a senha 
        */
        Console cons = System.console();
        System.out.print("\tEscreva algo: ");
        char[] e = cons.readPassword();
        System.out.println(e);
    }
}