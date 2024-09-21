/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;

import java.io.*;
import java.util.*;
/**
 *
 * @author Erick
 */

public class Files {
  
    public static void main(String[] args) {
        try{
         Scanner entrada = new Scanner(System.in);
        File arquivo = new File("/home/gil/Área de trabalho/arquivo.txt");
        arquivo.createNewFile();
         @SuppressWarnings("unchecked")
        FileWriter escrever = new FileWriter(arquivo, true);
         System.out.print("\n\tEntre com uma frase a ser escrita no arquivo: ");
         FileReader leitor = new FileReader(arquivo.getCanonicalFile());
         
        escrever.write(entrada.nextLine());
        escrever.close();
        

    }catch (IOException e){
        e.printStackTrace();
        
    }
}}
