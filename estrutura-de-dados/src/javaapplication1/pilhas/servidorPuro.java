/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.pilhas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Erick
 */
public class servidorPuro {
    public static void main(String[] args)throws Exception {
        ServerSocket serv= new ServerSocket(7211, 0);
        while(true){
            Socket soc = serv.accept();
            BufferedReader inp = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String linha = inp.readLine();
            if(linha.isBlank() || linha.isBlank()){
                continue;
            }
            System.out.print("Requisição recebida" + linha);
        }
    }
}
