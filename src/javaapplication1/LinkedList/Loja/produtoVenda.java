/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;


import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class produtoVenda extends Produto{
   
    public produtoVenda(String nome, double valor, boolean perecivel, int id, String descricao, int itensComprados) {
        super(nome, valor, perecivel, id, descricao, itensComprados);
    }
    
    public static Produto CadastrarProduto(){
        boolean ePerecivel;
        Scanner entrada = new Scanner (System.in);
        System.out.print("\n\tEntre com o nome do produto: ");
        String nome = entrada.next();
        System.out.print("\n\tEntre com o valor do produto: ");
        double valor = entrada.nextDouble();
        System.out.print("\n\tÉ perecivel? \n\t1 - Sim \n\t2- Não \n\t:");
        int perecibilidade = entrada.nextInt();
        ePerecivel = (perecibilidade ==1);
        System.out.print("\n\tEntre com o id:");
        int id = entrada.nextInt();
        System.out.print("\n\tEntre com a descricao do produto: ");
        entrada.nextLine();
        String descricao = entrada.nextLine();
        System.out.print("\n\tEntre com a quantidade de items em estoque: ");
        int items = entrada.nextInt();
        return new produtoVenda(nome, valor, ePerecivel, id, descricao, items);
    }

    
    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 30){
            return false;
        }
       
       this.setValor(this.getValor() - (porcentagem * 0.01));
        return true;
    }


    
}
