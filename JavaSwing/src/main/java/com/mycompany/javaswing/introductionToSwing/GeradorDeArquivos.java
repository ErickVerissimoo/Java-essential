/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing.introductionToSwing;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author Erick
 */
public class GeradorDeArquivos {
    public static void main(String[] args) throws IOException {
        JFrame Principal = new JFrame("Gerar arquivo");
        Principal.setResizable(false);
        Principal.getContentPane().setBackground(Color.magenta);
        Principal.setSize(500, 500);
        Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton criar = new JButton("Gerar");
        criar.setSize(80, 30);
        criar.setFocusPainted(false);
        criar.move(200, 250);
        Principal.add(criar);
        Principal.setLayout(null);
        JTextField nomeArquivo = new JTextField();
        nomeArquivo.setFont(new Font("Arial", Font.BOLD, 15));
        nomeArquivo.setSize(180, 30);
        nomeArquivo.move(150, 100);
        JLabel leiboOne = new JLabel("Entre com o nome do arquivo");
        leiboOne.setFont(new Font("Arial", Font.PLAIN, 18));
        criar.addActionListener((acao) ->{
            String nome = nomeArquivo.getText();
            File arquivo = new File("/home/gil/NetBeansProjects/JavaSwing/src/main/java/com/mycompany/javaswing/introductionToSwing/"+nome+".txt");
            if(!arquivo.exists()){
                try {
                    arquivo.createNewFile();
                } catch (IOException ex) {
                ex.printStackTrace();
        }
            }
            
            JOptionPane.showMessageDialog(criar, "arquivo criado");
        });
        leiboOne.setSize(350, 30);
        leiboOne.move(110, 50);
        Principal.add(leiboOne);
        Principal.add(nomeArquivo);
        Principal.show();
    }
}
