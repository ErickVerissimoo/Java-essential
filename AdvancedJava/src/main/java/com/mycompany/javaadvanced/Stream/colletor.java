/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *
 * @author Erick
 */
public class colletor {
    public static void main(String[] args) {
    List<Integer> lista = List.of(2, 3, 5, 21);
    List <Integer> newli= lista.stream().filter(x -> x>=21).collect(Collectors.toList());
    Iterator <Integer> percorridor = newli.iterator();
       while(percorridor.hasNext()){
           System.out.println(percorridor.next());
       }
       Stream <Integer> nova = lista.stream();
      var e= nova.filter(x-> x>10).toList();
       Stream <Integer> outro = lista.stream();
       var b = outro.anyMatch(x-> x==4);
        System.out.println(b);
    }
}
