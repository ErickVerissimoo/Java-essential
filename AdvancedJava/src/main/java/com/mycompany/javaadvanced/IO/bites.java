/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Iterator;
/**
 *
 * @author Erick
 */
public class bites {
    public static void main(String[] args)throws IOException {
        File arquivo = new File("novo.txt");
        arquivo.createNewFile();
        FileWriter escrevidor = new FileWriter(arquivo);
        escrevidor.write("Esse é um arquivo escrito e criado usando java");
        escrevidor.close();
        System.out.println("\n\tEntre com um valor:");
        InputStream bytes = System.in;
        System.out.println(bytes.read());
        InputStreamReader chares = new InputStreamReader(bytes);
        System.out.println(chares.getEncoding());
        char[] buffer = new char[1024];
        int letra = chares.read(buffer);
        System.out.println(letra);
        System.out.println(buffer);
        
        BufferedReader letrasNormais = new BufferedReader(chares);
        String linha = letrasNormais.readLine();
        System.out.println(linha);
    }
}
