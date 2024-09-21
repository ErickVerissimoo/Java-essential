/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Json;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import com.google.gson.Gson;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.File;
import javax.swing.JLabel;
/**
 *
 * @author Erick
 */
public class GeradorJson {
    public static void main(String[] args) {
        
        JFrame tela = new JFrame("Gerador de JSon");
        tela.setLayout(null);
        tela.setSize(500, 500);
        tela.getContentPane().setBackground(Color.pink);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea texto = new JTextArea();
        texto.setSize(300, 100);
        texto.setLocation(90, 90);
        JScrollPane scrollPane = new JScrollPane(texto);
        texto.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        texto.setLineWrap(true);
        JLabel leibo = new JLabel();
        leibo.setText("OLa leibo");
        leibo.setFont(new Font("Arial", Font.ITALIC, 15));
        leibo.setSize(70, 40);
        tela.add(leibo);
        tela.add(scrollPane);
        tela.add(texto);
        tela.setResizable(false);
        JButton gerar = new JButton("Gerar");
        gerar.setSize(80, 30);
        gerar.setFocusPainted(false);
        gerar.setLocation(190, 270);
        gerar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String captura = texto.getText();
                System.out.println(captura);
            }
            
        }
        
        );
        tela.add(gerar);
        tela.show();
        
    }
}
