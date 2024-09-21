/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.enums;

/**
 *
 * @author Erick
 */


public enum DaysOfWeek {
    /*
    Pelo fato de enums serem um conjunto relacionado
    de valores, não é possível estabelecer metodos
    especificos para cada enum separadamente. 
    */
    Segunda(1){
        @Override
        public String toString(){
            return "hoje é segunda";
        }
        
    }, Terca(2), Quarta(3), Quinta(4),
    Sexta(5), Sabado(6), Domingo(7);
    
    private int dia;
    
    DaysOfWeek(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return this.dia;
    }
    
    
}
