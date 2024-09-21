/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Threads;

/**
 *
 * @author Erick
 */
public class paralelismo {
    
   
    public static void main(String[] args) {
          Runnable runibo1 = () ->
        System.out.println("d");  
    
          Runnable runibo2 = () ->{ System.out.print("s");
         System.out.print("Segunda");
          };
          Thread minhaTreed = new Thread(runibo1);
         Thread minhaSegundaThread = new Thread(runibo2);
                var d = minhaSegundaThread.getName();
                System.out.println(d);
          minhaTreed.run();
              
    }
}
