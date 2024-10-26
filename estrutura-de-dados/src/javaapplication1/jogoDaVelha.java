/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Erick
 */
public class jogoDaVelha {
    public static void main(String[] args) {
        String[][] tabuleiro = new String[3][3];
        for(int j =0; j<tabuleiro.length;j++){
            for(int i = 0; i<tabuleiro.length; i++){
                tabuleiro[i][j] = "|";
            }
        }
              for(int j =0; j<tabuleiro.length;j++){
            for(int i = 0; i<tabuleiro.length; i++){
                System.out.print(tabuleiro[i][j]);
                if(i==2){
                    System.out.println();
                }
            }
        }}
    }

