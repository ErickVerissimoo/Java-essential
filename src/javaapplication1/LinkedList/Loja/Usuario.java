/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
/**
 *
 * @author Erick
 */
import java.util.Scanner;
public class Usuario {
    private String username;
    private String email;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public static Scanner getEntrada() {
        return entrada;
    }

    public static Random getRandom() {
        return random;
    }
    private String password;
    private int id = random.nextInt(0, 100000);
    static Scanner entrada = new Scanner (System.in);
    static Random random = new Random();

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
            
    public static void Cadastrar(LinkedList<Usuario> users){
        System.out.print("Entre com seu nickname");
        String nickname = entrada.next();
        System.out.println("Entre com seu email:");
        entrada.nextLine();
        String email = entrada.nextLine();
        System.out.println("Entre com uma senha: ");
        String senha = entrada.next();
        Usuario user = new Usuario(nickname, email, senha);
        users.addLast(user);
        entrada.close();
    }
    public static void Descadastrar(LinkedList<Usuario> users){
        ArrayList<Usuario> USERS = new ArrayList<>();
        USERS.addAll(users);
        System.out.print("Entre com seu nome de usuario: ");
        String nome = entrada.next();
        System.out.println("Entre com o seu email: ");
        String email = entrada.next();
        System.out.println("Entre com sua senha: ");
        String senha = entrada.next();
        for(Usuario use : USERS){
            if(use.email.equals(email) && use.password.equals(senha)
                    && use.username.equals(nome)){
                USERS.remove(use);
                break;
            }
        }
        System.out.println("Usuario descadastrado com sucesso");
    }
    public void FinalizarCompra(Carrinho carrinho){
        LinkedList <Produto> produtos = carrinho.getProdutos();
        System.out.print(carrinho.toString());
        System.out.println("Compra finalizada! ");
    }
    
}
