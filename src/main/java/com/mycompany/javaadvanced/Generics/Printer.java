/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Generics;



/**
 *
 * @author Erick
 * @param <T>
 */

/*
Em Java, genéricos são uma forma de facilitar 
a criação de classes flexiveis, pois permitem tratar as variaveis
de maneira ampla. Como assim? Bem, imaginemos que eu queira criar 
uma classe que recebe uma variavel do tipo x e a imprima, mas porventura
surgiu a necessidade de criar um outro programa semelhante a classe
da variavel x, mas que receba uma variavel de outro tipo. Sem os genericos
o mais normal a se fazer seria criar outra classe, ou fazer o casting
das variaveis. Isso até funcionaria, mas seria dificil de manter a medida
que o programa escalar. A maneira mais facil de fazer isso seria com
genericos. Veja o exemplo abaixo
*/

/*
Primeiro colocamos ao lado do nome da classe entre <> qualquer coisa,
para que a nossa classe consiga usar genericos. Por convenção,
usa-se a letra T. Letra T = generico comumente. 
*/

public class Printer <T>{
    T entrada;
    /*
    T = qualquer coisa, durante a instanciação do objeto define-se
    o tipo de T, ou não. Caso não seja definido o tipo de T, T poderá
    ser qualquer coisa. O compilador com base no valor definido para T,
    descubrirá o tipo de T.
    */
    public Printer(T entrada){
        this.entrada = entrada;
       
    }
    
    public void Printar (){
       
        if (entrada instanceof Number){
            System.out.println("É um inteiro");   
        }
        if(entrada instanceof String){
            System.out.println("É uma string");
            
        }
  
     }
       public T getGeneric(){
         return entrada;
    }

}
