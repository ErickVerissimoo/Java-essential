/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Erick
 */
public class bits {
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner entrada = new Scanner(new File("novoarquivo.txt"));
        while(entrada.hasNext()){
            System.out.println(entrada.nextLine());
      
        }
    }
}
