/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.pilhas;
import java.util.*;
/**
 *
 * @author Erick
 */
public class Pilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        A pilha é uma estrutura de dados muito semelhante ao mundo real,
        onde o acesso aos elementos se dá principalmente pelos métodos push,
        pop, peek, e search. A pilha também possui outros métodos da classe lista.
        O metodo peek retorna o ultimo elemento da lista, o metodo pop retorna o
        ultimo elemento da lista e depois o remove, o metodo push insere um elemento
        na ultima posição e o metodo search que busca determinado elemento na lista
        a partir do ultimo inserido e retorna em qual posição o elemento está do ultimo
        para trás de forma decrescente
        */
       Stack <String> pilha = new Stack<>();
       pilha.push("Ovo");
       pilha.push("Bolo de morango");
       pilha.push("banana");
       pilha.push("abacaxi");
       pilha.push("maracuja");
       pilha.push("macaco");
       pilha.push("Bolovo");
       pilha.push("macarrão");

    System.out.println(pilha);
        System.out.println(pilha.pop());
        System.out.print(pilha);
        System.out.print(pilha.search("abacaxi"));
  
    }

}
