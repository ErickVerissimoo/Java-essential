/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.enums;

/**
 *
 * @author gil
 */
public enum ACOES {
    COMER, ANDAR;

    void executar() {
        comer();
    }

    private void comer() {
        System.out.println("comeu");
       
    }
}