/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.recursao;

/**
 *
 * @author Erick
 */
public class decrescente {

    public static Number decrescente(int numero) {
        numero--;
        if (numero == 0) {
            return 0;
        }
        System.out.print(numero + ", ");
        return decrescente(numero);

    }

    public static void main(String[] args) {
        decrescente(20);
    }
}
