/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;
import java.util.LinkedList;
/**
 * 
 * @author Erick
 */
public class Carrinho {
    private Produto produto;
    
    public int getTotal_items() {
        return Total_items;
    }
    private double ValorTotal = 0;
    private int Total_items = 0;
    private LinkedList <Produto> produtos = new LinkedList<>();
    public Produto getProduto() {
        return produto;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }
   
    
    public void AdicionarProduto(){
        this.getProdutos().add(produtoVenda.CadastrarProduto());
        this.ValorTotal += this.getProdutos().getLast().getValor();
        this.Total_items++;
    }
    
    @Override
    public String toString(){
        return "\n\tO valor total da compra está em: " + this.getValorTotal()
                + "\n\tO total de items está em: " + this.getTotal_items();
    }
}
