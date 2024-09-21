/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Threads;

/**
 *
 * @author Erick
 */
public class Main extends Thread {
    
    public void run(){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        String a = entrada.nextLine();
        
        System.out.println(a);
    }
   
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Isso é uma thread em primeiro plano");
        
    }
}
