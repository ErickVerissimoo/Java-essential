/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public abstract class loja {
   public static LinkedList <Usuario> users = new LinkedList<>();
   public static Scanner entrada = new Scanner(System.in);
   public static void TelaInicial(){
         int opcao;
       do{
       System.out.println("Bem vindo a nossa loja! O que você deseja fazer?"
               + "1 - Login"
               + "2 - Cadastrar"
               + "3 - Área do colaborador");
       opcao = entrada.nextInt();
       if(opcao== 2){
           Usuario.Cadastrar(users);
           
       }
       
       
   }while(opcao!=1 && opcao!=2 && opcao!=3);}
   public static void Login(LinkedList <Usuario> users){
       System.out.println("Entre com o seu nome de usuario");
       String nome = entrada.next();
       System.out.println("Entre com a sua senha");
       String senha = entrada.next();
       for(Usuario user : users){
           if(user.getPassword().equals(senha) && user.getUsername().equals(nome)){
               System.out.println("Usuario logado com sucesso");
           }else{
               System.err.println("Erro no login");
           }
       }
   }
   public static void ListaProdutos(){
       
   }
   
}
