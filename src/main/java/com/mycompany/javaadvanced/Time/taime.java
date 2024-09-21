/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Time;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class taime {
    public static void main(String[] args) {
        System.out.print("\n\tEntre com uma data: ");
        String data = new Scanner(System.in).nextLine();
        String semEspaco = data.replaceAll("\\s+", "").trim();        
       
        /*
        O método parse recebe uma string, e logo em seguida
        usando DateTimeFormatter, definimos o formato esperado
        da string, no nosso caso, primeiro dia, depois mês e por fim
        o ano
        */
        LocalDate e = LocalDate.parse(semEspaco, DateTimeFormatter.ofPattern("ddMMyyyy"));
        String saida = String.valueOf(e.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(saida);
    }
}
