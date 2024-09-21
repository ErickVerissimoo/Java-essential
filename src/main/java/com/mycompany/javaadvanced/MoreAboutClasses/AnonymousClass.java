/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MoreAboutClasses;


/**
 *
 * @author Erick
 */
public class AnonymousClass  {
   String teste;
    protected interface Lambda{
       void fazerAlgo();
      
   }
    
    class novaClasse implements Lambda{

        @Override
        public void fazerAlgo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) {
        var bi = new AnonymousClass();
        var ie = bi.new novaClasse();
        
        Lambda acao = new Lambda() {
            @Override
            public void fazerAlgo() {
                System.out.print("Fazendo alguma coisa");
           ie.fazerAlgo();
           
            }
       };
      acao.fazerAlgo();

    }
}
