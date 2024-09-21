/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.enums;

/**
 *
 * @author Erick
 */
public enum DiaDaSemana {
    SEGUNDA("Segunda-feira"), TERCA("Terça-feira"), QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"), SEXTA("Sexta-feira"), SABADO("Sábado"), DOMINGO
    ("Domingo");
    
    private final String palavra;
    
    DiaDaSemana(String palavra){
        this.palavra = palavra;
        
    }
    public String getPalavra(){
        return palavra;
    }
}

