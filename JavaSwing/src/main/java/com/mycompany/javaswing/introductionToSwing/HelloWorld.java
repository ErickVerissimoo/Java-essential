/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing.introductionToSwing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Erick
 */
public class HelloWorld {

   
    public static void main(String[] argumentos) {
        JPanel imagem = new JPanel(){
            private Image imagem = new ImageIcon("/home/gil/NetBeansProjects/JavaSwing/src/main/java/com/mycompany/javaswing/introductionToSwing/java.png").getImage();
            
            
               @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagem, 0, 0, 120, 120, this);
            }
        };
            
        
        Image imagem2 = new ImageIcon("/home/gil/NetBeansProjects/JavaSwing/src/main/java/com/mycompany/javaswing/introductionToSwing/java.png").getImage();
        JTextField entrada = new JTextField();
        entrada.setSize(210, 35);
        entrada.move(135, 150);
        entrada.setFont(new Font("Arial", Font.PLAIN, 18));
        entrada.setOpaque(Boolean.TRUE);
        Dimension dimensao = new Dimension(500, 500);
        Font fonte = new Font("Arial", Font.ITALIC, 15);
        Font fonte2 = new Font("Arial", Font.BOLD, 24);
        JFrame tela = new JFrame("Ola mundo");
        imagem.setBackground(Color.yellow);
        JButton botao = new JButton("Clique");
        botao.setFont(fonte);
        botao.setBounds(170, 260, 130, 45);
        botao.setBorderPainted(true);
        botao.setFocusPainted(false);
        tela.setSize(dimensao);
        JLabel leibo = new JLabel("Hello Swing");
        leibo.setSize(170, 41);
        leibo.setFont(fonte2);
        leibo.move(140, 80);
        imagem.add(botao);
        imagem.add(leibo);
        imagem.add(entrada);
        tela.setContentPane(imagem);
        tela.setLayout(null);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setIconImage(imagem2);
        tela.setVisible(true);
        

    }}