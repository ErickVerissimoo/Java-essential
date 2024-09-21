/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataOutput;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.DataInput;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class entradadado {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File arquivo = new File("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/data.bin");
        arquivo.createNewFile();
        DataInput entrou = new DataInputStream(new FileInputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/data.bin"));
        DataOutput autiputi = new DataOutputStream(new FileOutputStream ("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/novodata.bin"));
        autiputi.writeUTF("calma calabreso");
        FileInputStream entrada = new FileInputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/data.bin");
        BufferedWriter escrividor = new BufferedWriter(new FileWriter (arquivo));
        escrividor.write("this is a number too large");
        escrividor.close();
        BufferedReader lerdados = new BufferedReader (new FileReader(arquivo));
        String leitura = String.format(String.valueOf(lerdados.read()), "%s");
        System.out.println(leitura);
        System.out.println("\n\tEntre com algo: ");
       
        escrividor.write(leitura);
        
        
        DataInputStream entrad2 = new DataInputStream (new FileInputStream("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/IO/data.bin"));
        Scanner entri = new Scanner(entrad2);
        byte log = entri.nextByte();
        System.out.println(log);
    }
}
