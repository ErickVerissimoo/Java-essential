/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList.Loja;

/**
 *
 * @author Erick
 */
public abstract class Produto {
    private String nome;
    private double valor;
    private boolean perecivel;
    private int id;
    private String descricao;
    private int itensComprados;
    private Cupons cupom;

    public Cupons getCupom() {
        return cupom;
    }

    public void setCupom(Cupons cupom) {
        this.cupom = cupom;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setItensComprados(int itensComprados) {
        this.itensComprados = itensComprados;
    }

 

    
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getItensComprados() {
        return itensComprados;
    }
    
       public Produto(String nome, double valor, boolean perecivel, int id, String descricao, int itensComprados) {
        this.nome = nome;
        this.valor = valor;
        this.perecivel = perecivel;
        this.id = id;
        this.descricao = descricao;
        this.itensComprados = itensComprados;
    }
       protected abstract boolean aplicarDesconto (double porcentagem);
}
