/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO.serializacao;
import java.io.*;
/**
 *
 * @author Erick
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        product produto = new product("Nescau", 12.2);
        ObjectOutputStream fluxo = new ObjectOutputStream(new FileOutputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/serializacao/saida.bytes")); 
        fluxo.writeObject(produto);
        fluxo.close();
        }
}
