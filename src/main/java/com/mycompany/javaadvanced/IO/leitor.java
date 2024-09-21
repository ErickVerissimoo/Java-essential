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
public class leitor {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       FileInputStream ler = new FileInputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/novo-arquivo.txt");
       InputStreamReader lear = new InputStreamReader(ler);
       BufferedReader leior = new BufferedReader(lear); 
       PrintWriter escritor = new PrintWriter(new FileWriter("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/novo-arquivo.txt", true));
       escritor.write("escrevendo mais\n outro");
       escritor.print("huehuebr");
       
       escritor.close();
    }
}
