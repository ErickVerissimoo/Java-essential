/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MoreAboutClasses;

/**
 *
 * @author Erick
 */
public class Triangle {
    private class Triangulo{
        double base;
        double altura;

        public double getBase() {
            return base;
        }

        public double getAltura() {
            return altura;
        }
        
               
        public Triangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
            
        }
        
        public Triangulo(){
            this(1, 2);
        }
    }
    public static void main(String[] args) {
        Triangle b = new Triangle ();
        /*
        Para acessar classes internas da classe externa, é necessaria
        a instanciação de um objeto da classe externa, e então a partir da 
        instancia da classe externa, criar uma instancia da classe interna, como
        no exemplo abaixo.
        */
        Triangle.Triangulo a = b.new Triangulo();
        System.out.println(b.getClass());
        System.out.println(a.getClass());
                
    }
}
