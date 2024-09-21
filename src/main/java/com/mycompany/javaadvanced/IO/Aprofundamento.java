/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 *
 * @author Erick
 */
public class Aprofundamento {
    public static void main(String[] args)throws IOException {
       InputStream leitor = System.in;
       int ler;
       int indice = 0;
       char [] buffer = new char[100];
       while (indice < buffer.length && (ler = leitor.read()) != -1) {
           if (ler == '\n' ) { 
               break; 
           }
           
           buffer[indice++] = (char) ler;
     

       }
       for(int i = 0; i<buffer.length;i++) {
    	   System.out.print(buffer[i]);
    	 	if(buffer[i]=='\n') {
          		break;
          	}
       }

    }}
