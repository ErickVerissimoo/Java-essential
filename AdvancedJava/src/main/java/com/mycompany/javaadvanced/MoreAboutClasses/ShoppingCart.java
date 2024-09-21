/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MoreAboutClasses;


/**
 *
 * @author erick
 */
public class ShoppingCart {
    static java.util.LinkedList <Object> lista = new java.util.LinkedList<>();
    
  
  
    public static Object addItem(String Nome, double Preco){
       
        class Item{
         
      
        private String nome;
        private double preco;
        public Item(){
           this.nome = Nome; 
           this.preco = Preco;
           
        }
        
     
            public String getNome() {
                return nome;
            }

            public double getPreco() {
                return preco;
            }
       
           public Item retornarItem(Object objeto){
             Item item = (Item) objeto;
             return item;
             
           }
           @Override 
           public String toString(){
               return "\n\tNome do produto: " + this.getNome() +
                       "\n\tPreço: " + this.getPreco();
           }
        }
       // class product extends Item{
          // Em java uma classe pode estender outra no 
          // mesmo arquivo. 
        //}
        
      return new Item();
     

}
/*
    Em java, classes estaticas se assemelham a uma classe que está no
    mesmo nivel da classe mais externa do arquivo, neste caso, 
    a classe shoppingcart, e portanto, a classe externa e a classe
    interna apenas interagem através de métodos e atributos estáticos.
    Ou seja, uma classe estática não consegue interagir com atributos
    e métodos que pertençam aos objetos da classe
    */
static class test{
    
    public void a(){
        System.out.print(lista);
    }
}

    public static void main(String[] args) {
      
  
        lista.addLast(addItem("Nescau", 30));
       
        for(Object ae: lista){
            System.out.println(ae);
        }
    }

}
