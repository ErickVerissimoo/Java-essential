/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Stream;
import java.util.*;
import java.util.function.Consumer;
/**
 *
 * @author Erick
 */
public class Lambda {
    public static void main(String[] args) {
        LinkedList<Funcionario> funcionarios = new LinkedList<>();
        /*
        O consumer é o parametro do metodo forEach implementado
        pelas collections. 
        */
        Consumer <Funcionario> a = t->System.out.print(t);
        funcionarios.forEach(a);
    }
}
