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
public class arquivos {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/arquivo.txt");

        // file.createNewFile();
        // Scanner entrada = new Scanner(System.in);
       // FileWriter escritor = new FileWriter(file);

        //escritor.write("Este é um teste");
        FileReader leitor = new FileReader(file);
        char[] letras = new char[15];
        int size;
        leitor.read(letras);
        for (size = 0; size<letras.length; size++ ) {
            System.out.print(letras[size]);
        }
        //escritor.close();
        leitor.close();
        
    }
}
