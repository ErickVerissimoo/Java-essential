/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
/**
 *
 * @author Erick
 */
public class Buffer {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/novo-arquivo.txt");
        file.createNewFile();
        var caminho = file.getPath();
        FileInputStream entrada = new FileInputStream(file);
        InputStreamReader entrada2 = new InputStreamReader(entrada);
        BufferedReader leitor = new BufferedReader(entrada2);
        String linha = leitor.readLine();
        System.out.println(linha);
    }
}
