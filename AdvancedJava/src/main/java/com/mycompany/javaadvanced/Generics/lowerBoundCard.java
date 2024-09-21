/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Generics;

import java.util.List;

/**
 *
 * @author Erick
 */
public class lowerBoundCard {
    public static void Mostrar(List<? super Integer> numeros){
        
            System.out.println(numeros);
        }
    }

