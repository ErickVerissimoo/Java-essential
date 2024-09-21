/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Erick
 */
public class EstrieamParalela {
    public static void main(String[] args) {
        List <Integer> lista = Arrays.asList(1, 3, 4, 5, 21, 22, 33);
        lista.parallelStream();
    }
}
