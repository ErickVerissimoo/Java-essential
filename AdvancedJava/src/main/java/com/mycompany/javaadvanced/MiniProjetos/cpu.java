/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MiniProjetos;

import java.util.List;

/**
 *
 * @author Erick
 */
public class cpu extends Jogo {
    private Jogada maquina;
    
   public void GerarJogada(List jogadas ){
       java.util.Random aleatorio = new java.util.Random();
       int jogds = aleatorio.nextInt(0, 9);
       while(jogadas.get(jogds).equals(Player.class) || jogadas.get(jogds).equals(this.getClass())){
           jogds = aleatorio.nextInt(0, 9);

       }
       jogadas.set(jogds, this.maquina);
   }
}