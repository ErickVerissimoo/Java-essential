/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Erick
 */
public class arreideBites {
    public static void main(String[] args) throws IOException {
        byte[] array = {2, 4, 23, 22, 55}; 
        ByteArrayInputStream arrei = new ByteArrayInputStream(array);  
        
        InputStreamReader fluxo = new InputStreamReader(arrei);
        Integer e = fluxo.read();
        
        System.out.println(e);
    }
}
