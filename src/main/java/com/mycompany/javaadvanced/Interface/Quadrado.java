/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Interface;

/**
 *
 * @author Erick
 */
public class Quadrado implements Poligono {
    private double lado1, lado2, lado3, lado4;
    
    public Quadrado(){
        
    }
    public Quadrado(double lado1, double lado2, double lado3, double lado4){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        System.out.println("Quadrado criado");
    }
    
    
    @Override
    public double getArea(double base, double altura) {
        return base * altura;
    }


    @Override
    public double getPerimetro() {
        return lado1+lado2+lado3+lado4;
    }
    
}
