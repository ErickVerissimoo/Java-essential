/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.IO.serializacao;
import java.io.Serializable;
/**
 *
 * @author Erick
 */
public class product implements Serializable {
    protected String name;
    private static final long serialVersionUID = 6746083229950603661L;
    
    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    protected double price;
}
