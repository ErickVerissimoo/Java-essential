/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.*;
/**
 *
 * @author Erick
 */
public class More {
    public static void main(String[] args) throws IOException {
        System.out.print("\n\tEntre com algo: ");
        InputStream bytes = System.in; 
        int one = bytes.read();
        System.err.println(one);
        PrintStream out = System.out;
        
        out.print(2);
        out.append("a");
    }
}
