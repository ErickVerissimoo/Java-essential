/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.StringBuilder;

/**
 *
 * @author Erick
 */
public class ConstrutorDeString {
    public static void main(String[] args) {
        /*
        StringBuilders são Strings mútaveis. Isto é,
        um tipo de String que permite ter seu valor
        diretamente alterado, o que permite uma enorme
        flexibilidade no momento de manipular as Strings. 
        */
        StringBuilder string = new StringBuilder();
        string.append("a");
        string.append("as");
        System.out.println(string);
        String a = "a";
        a+="ssss";
        /*
        Strings comuns tem como limitação o fato de serem 
        imutáveis, isto é, uma vez criadas e terem seus 
        valores atribuidos, não é possível alterar seu valor
        diretamente. Sempre que uma string é modificada. Quando
        uma String tem seu valor modificado, a string não teve
        seu valor diretamente modificado, o que ocorreu foi que
        o Java criou uma nova String com aquele valor, e o novo 
        valor foi atribuido a antiga String. 
        */
        System.out.println(a.concat("asas"));
        System.out.println(a);
        string.insert(2,"o que");
        System.out.println(string);
        
    }}