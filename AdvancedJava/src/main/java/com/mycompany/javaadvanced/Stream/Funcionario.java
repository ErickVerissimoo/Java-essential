/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javaadvanced.Stream;

import java.util.*;

/**
 *
 * @author Erick
 */
public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private int id;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Funcionario(String nome, int id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "\n\tNome: " + this.getNome()
                + "\n\tID: " + this.getId();
    }

    public static void main(String[] args) {
        LinkedList<Funcionario> armazem = new LinkedList<>();

        Collections.sort(armazem);

        //armazem.stream().forEach(System.out::println);
    }

    public int compareTo(Funcionario outro) {
        if (this.getSalario() < outro.getSalario()) {
            return -1;
        }
        if (this.getSalario() > outro.getSalario()) {
            return 1;
        }
        return 0;

    }
}
