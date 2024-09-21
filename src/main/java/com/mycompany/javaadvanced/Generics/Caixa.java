/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Generics;
import java.util.*;
/**
 *
 * @author Erick
 */
public class Caixa<T> {
    private T elemento;
    private List<T> caixa = new ArrayList<>();
    public void ColocarElemento(T elemento){
        this.elemento = elemento;
        caixa.add(this.elemento);
    }
    public void MostarCaixa(){
        for(T elementos : caixa){
            System.out.println(elementos);
        }
    }
}
