/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MiniProjetos;

/**
 *
 * @author Erick
 */
public class Jogada {
    private String jogada;

    public String getJogada() {
        return jogada;
    }
   
    public <T extends Jogo> Jogada(T entrada){
        if (entrada instanceof Player){
            this.jogada = "X";
            return;
        }
        this.jogada = "O";
        }
    
            
 
}
