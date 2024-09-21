/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MoreAboutClasses;

/**
 *
 * @author Erick
 */
public class Geometria {
    interface arestas{
        void CalcularArea();
    }
    
    
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Entre com a base: ");
        double Base = entrada.nextDouble();
        System.out.println("Entre com a altura");
        double Altura = entrada.nextDouble();
        /*
        Em java é possivel criar classes anonimas a partir 
        de uma interface, como no exemplo abaixo. Porém, as classes
        anonimas tem algumas limitações, como por exemplo não podem
        ter construtores próprios. Além disso, não podem conter
        membros estáticos e não tem nome próprio.
        */
        arestas Triangulo = new arestas(){
           double base;
             double altura;
            
          
            @Override
            public void CalcularArea() {
                this.base = Base;
                this.altura = Altura;
                double resultado = (base * altura)/2;
                System.out.printf("Área: %f", resultado);
            }
   
        };
        Triangulo.CalcularArea();

       
    }
}
