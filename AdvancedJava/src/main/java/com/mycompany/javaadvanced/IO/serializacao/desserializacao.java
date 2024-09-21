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
public class desserializacao {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream desse = new ObjectInputStream(new FileInputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/serializacao/saida.bytes"));
        product produto =(product) desse.readObject();
        System.out.println(produto.name);
    }
}
