/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Generics;
import static com.mycompany.javaadvanced.Generics.MoreAboutGeneric.*;
/**
 *
 * @author Erick
 */
public class Principal {
    public static <U> void Generico (U[] array){
        for(U e : array){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Printer<String> generico = new Printer<>("W");
        generico.Printar();
        
        /*
        Os genericos em Java NÃO conseguem trabalhar com
        tipos primitivos
        */
        Number[] qualquer = {1, 3, 5, 23, 24, 455, 23};
        Generico(qualquer);
        Caixa <Integer> caixa = new Caixa();
        caixa.ColocarElemento(-312);
        caixa.ColocarElemento(34);
        caixa.ColocarElemento(245);
        caixa.MostarCaixa();
        caixa.ColocarElemento(+4545);
        caixa.MostarCaixa();
        voltar(232.23);
        voltar("ola mundo");
        
        
    }
}
