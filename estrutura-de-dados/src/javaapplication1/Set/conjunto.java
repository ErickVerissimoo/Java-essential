/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Set;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
/**
 *
 * @author Erick
 */
public class conjunto {
   
    /*
    Set na tradução literal significa conjunto, ou seja,
    um agrupamento de elementos. Em Java é basicamente a mesma coisa:
    um agrupamento de elementos que caso se repita, esta repetição é
    totalmente ignorada. Ou seja, um elemento só é contabilizado uma única 
    vez. É bom para validação de tokens, cupons, códigos e etc, pois 
    impede que o mesmo elemento se repita na estrutura de dados. 
    Para utilizar o Set, é necessário instanciar uma de suas aplicações,
    podendo ser o hashSet ou o ThreeSet. 
    */
    public static void main(String[] args) {
         Set <String> lista = new HashSet<>();
         lista.addAll(Arrays.asList("Bacana", "Bacana", "Ovo", "Ovo"));
         System.out.println(lista.size());
        
    }
}
