/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;
import java.util.*;
/**
 * 
 * 
 * @author Erick
 */
public abstract class Loja extends loja{

    public static void main(String... args) {
      
        Scanner entrada = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        carrinho.AdicionarProduto();
        System.out.println(carrinho);
       
    }
    
  
}
