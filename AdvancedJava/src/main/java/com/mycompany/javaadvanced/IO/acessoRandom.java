/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;


/**
 *
 * @author Erick
 */
public class acessoRandom {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        RandomAccessFile acessor = new RandomAccessFile(new File("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/arquivods.txt"), "rw");
        acessor.writeUTF("heldadsdsalo world meu mundo sei la");
        acessor.seek(3);
        
        acessor.close();
        
    }
}
