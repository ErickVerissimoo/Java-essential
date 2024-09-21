/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing.introductionToSwing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class Acoes  {
    public static void main(String[] args) {
        JFrame principal = new JFrame("Acoes");
        
      
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton botao = new JButton("clique");
        botao.setBounds(100, 100, 50, 20);
          ActionListener acao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(botao, "ola mundo");
            }
        };
          botao.addActionListener(acao);
          botao.setFocusPainted(false);
        principal.add(botao);
        principal.setLayout(null);
        principal.setResizable(false);
        principal.setSize(500, 500);
        principal.setVisible(true);
        botao.add(botao);
      
    }
    
 
}
