/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.javaadvanced.Interface;

/**
 *
 * @author Erick
 */
public interface Carro {
    
    default void Acelerar(){
        System.out.println("O carro está acelerando");
    }
    
    static void Desacelerar(){
        System.out.println("O carro está desacelerando");
    }
    
    void Estacionar();
    
    
}
