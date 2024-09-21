/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Erick
 */
 public class extremamentePreciso {
     
    public static void main(String[] args) {
        /*
        O bigDecimal é a classe mais precisa no que
        tange a operações matemáticas em Java
        */
        BigDecimal numero1 = new BigDecimal("0.002");
        BigDecimal numero2 = new BigDecimal("0.002");
       
        System.out.println( numero2.add(numero1).doubleValue()); 
   
    }
}
