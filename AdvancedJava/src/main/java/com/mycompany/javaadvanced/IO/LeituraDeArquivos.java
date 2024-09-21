/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Erick
 */
public class LeituraDeArquivos {
    public static void main(String[] args) throws IOException {
        FileInputStream entrada = new FileInputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/arquivo.txt");
        FileOutputStream saida = new FileOutputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/novoarquivo.txt");
        int letra;
        while((letra = entrada.read()) != -1){
            saida.write(letra);
        }
        BufferedInputStream novaEntrada = new BufferedInputStream(new FileInputStream("novoarquivo2.txt"));
        BufferedOutputStream novaSaida = new BufferedOutputStream(new FileOutputStream("novasaida.txt"));
    }
}
