/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MiniProjetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Tabuleiro {
    private List<Jogada> tabuleiro;

    public List<Jogada> getTabuleiro() {
        return tabuleiro;
    }
    
    
    public Tabuleiro(){
        tabuleiro = new ArrayList<>();
        for(int i = 0; i<9; i++){
            tabuleiro.add(i, null);
        }
    }
    
    public void Interface (){
        for(int i = 0;i<this.tabuleiro.size(); i++){
                if(this.tabuleiro.get(i)==null){
                System.out.print(" |");
            } 
           
             if(i==2 || i==5){
                 System.out.println();
            }
          
         
         
        }}
        
    public void Interface (Jogada jogada){
        for(int i = 0;i<this.tabuleiro.size(); i++){
                if(this.tabuleiro.get(i)==null){
                System.out.print(" |");
            } 
                
                if(this.tabuleiro.get(i) instanceof Jogada){
                    System.out.println(jogada.getJogada());
                }
           
             if(i==2 || i==5){
                 System.out.println();
            }
          
         
         
        }}
        
     
        public Integer LocalizarJogada(Jogada e){
            System.out.println("Entre com a localização da jogada de 1 a 9");
            int entrou = new java.util.Scanner(System.in).nextInt();
            if(this.tabuleiro.get(entrou).equals(e)){
                System.err.print("Local já ocupado");
                return null;
            }
            return entrou;
        }
        public void AdicionarJogada(Jogada e){
            Integer jogada;
            do{
             jogada = LocalizarJogada(e);} while(jogada == null);
            this.tabuleiro.set(jogada, e);
            System.out.print("\n\tJogada realizada com sucesso!");
        }
    }
    


