/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
/**
 *
 * @author Erick
 */
public abstract class Comparar  {

 
    static class Compra{
        public Double valor;
        public String produto;
        
              
    
                    }
        
    
   
    
    public static void main(String[] args) {
        Compra transacao = new Compra();
        transacao.valor = 23.2;
        Compra transacao2 = new Compra();
        transacao2.valor = 11.2;
        Compra transacao3 = new Compra();
        transacao3.valor = 44.3;
        Compra transacao4 = new Compra();
        transacao4.valor = 1.0;
        List <Compra> transacoes;
        transacoes = Arrays.asList(transacao, transacao2, transacao3, transacao4);
        Collections.sort(transacoes, new Comparator(){
            
            @Override
        public int compare (Object c1, Object c2){
            Compra nova = (Compra) c1;
            Compra outra = (Compra) c2;
            return nova.valor.compareTo(outra.valor);
        }

          
    });
        
        for(Compra valor : transacoes){
            System.out.println(valor.valor);
        }
    }   


    
}
