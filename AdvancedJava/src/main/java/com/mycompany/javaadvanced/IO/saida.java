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
public class saida {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream cuspidor = new FileOutputStream("saida.txt");
        BufferedOutputStream cuspir = new BufferedOutputStream(cuspidor);

    }
}
