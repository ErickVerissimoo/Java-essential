/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.pilhas;
import java.util.*;
/**
 *
 * @author Erick
 */
public class FazerEdesfazerAções {
    public static void main(String[] args) {
        Stack <String> pilha = new Stack <>();
        
        Scanner entrada = new Scanner (System.in);
            System.out.println("\n\tEntre com uma palavra: ");
            pilha.push(entrada.next());
        while(true){
        
            System.out.println(pilha);
            System.out.println("\n\tVocê deseja avançar ou desfazer a ultima ação? \n\t1 - Avançar"
                    + "\n\t2 - Desfazer");
            int escolha = entrada.nextInt();
            if(escolha == 1){
                 System.out.println("\n\tEntre com uma palavra: ");
            pilha.push(entrada.next());
      
            }
            else {
                pilha.pop();
       
            
            }
        } 
    }
}
