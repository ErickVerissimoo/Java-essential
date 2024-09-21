
/*
 * Gerador de um arquivo pessoa
 * usando swing pra interface gráfica
 */

package com.mycompany.javaadvanced.XML;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import org.w3c.dom.Element;
public class PersonGerador {

	/*
	 * Classe estática porque eu não quero
	 * ter que criar uma instancia da classe
	 * "PersonGerador" para só então instanciar
	 * uma pessoa
	 */
	public static class Pessoa{
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		private String nome;
		private String sobrenome;
		private int idade;
		// Endereço vai ser uma String mesmo,
		// Criar uma classe endereco
		// daria um pouco de trabalho
		private String endereco;
		
		public String getEndereco() {
			return endereco;
		}
		
		public Pessoa(String nome, String sobrenome, int idade, String endereco) {
			this.nome=nome;
			this.sobrenome=sobrenome;
			this.idade=idade;
			this.endereco=endereco;
		}
	}
	
	public static void main(String[] args) {
		Dimension dimensao = new Dimension(180, 25);
		// Criar interface para gerar pessoa.xml
		JFrame tela = new JFrame("Gerar pessoa");
		// Sem layout manager para dar maior 
		// flexibilidade na disposição dos elementos na tela
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setBackground(Color.pink);
		tela.setResizable(false);
		tela.setSize(new Dimension(500, 500));
		JLabel textinho = new JLabel();
		textinho.setFont(new Font("Arial", Font.BOLD, 23));
		textinho.setText("Pessoa");
		textinho.setSize(new Dimension(70, 40));
		textinho.move(180, 5);
		JTextField nome = new JTextField();
		nome.setSize(dimensao);
		nome.move(130, 85);
		JLabel nomeP = new JLabel("Nome:");
		nomeP.setSize(50, 40);
		nomeP.move(200, 45);
		nomeP.setFont(new Font("Arial", Font.PLAIN, 14));
		JLabel sobrenome = new JLabel("Sobrenome:");
		sobrenome.setFont(new Font("Arial", Font.PLAIN, 14));
		sobrenome.setSize(110, 35);
		sobrenome.move(190, 115);
		JTextField sobreNome = new JTextField();
		sobreNome.setSize(dimensao);
		sobreNome.move(130, 145);
		JTextField IDADE = new JTextField();
		IDADE.setSize(dimensao);
		IDADE.move(130, 205);
		JLabel idade = new JLabel("Idade:");
		idade.setFont(new Font("Arial", Font.PLAIN, 14));
		idade.setSize(60, 40);
		idade.move(200, 165);
		JTextField ENDERECO = new JTextField();
		JLabel endereco = new JLabel("Endereço:");
		endereco.setFont(new Font("Arial", Font.PLAIN, 14));
		endereco.setSize(110, 50);
		endereco.move(190, 225);
		ENDERECO.setSize(dimensao);
		ENDERECO.move(130, 270);
		JButton botao = new JButton("Gerar");
		botao.setSize(90, 30);
		botao.move(175, 310);
		
		botao.setFocusPainted(false);
		botao.addActionListener((acao)->
		{
			String NOME =  nome.getText();
			String SOBRENOME = sobreNome.getText();
			int IDADEE = Integer.parseInt(IDADE.getText());
			String ENDERECOO = ENDERECO.getText();
			Pessoa PESSOA = new Pessoa(NOME, SOBRENOME, IDADEE, ENDERECOO);

			DocumentBuilderFactory construir = DocumentBuilderFactory.newInstance();
			construir.setNamespaceAware(true);

			try {
			    DocumentBuilder document = construir.newDocumentBuilder();
			    org.w3c.dom.Document documento = document.newDocument();

			    Element pessoa = documento.createElement("pessoa");
			    documento.appendChild(pessoa);

			    Element nomeElement = documento.createElement("nome");
			    nomeElement.setTextContent(PESSOA.getNome());
			    pessoa.appendChild(nomeElement);

			    Element sobrenomeElement = documento.createElement("sobrenome");
			    sobrenomeElement.setTextContent(PESSOA.getSobrenome());
			    pessoa.appendChild(sobrenomeElement);

			    Element idadeElement = documento.createElement("idade");
			    idadeElement.setTextContent(String.valueOf(PESSOA.getIdade()));
			    pessoa.appendChild(idadeElement);

			    Element enderecoElement = documento.createElement("endereco");
			    enderecoElement.setTextContent(PESSOA.getEndereco());
			    pessoa.appendChild(enderecoElement);

			    TransformerFactory tf = TransformerFactory.newInstance();
			    Transformer transformer = tf.newTransformer();
			    DOMSource source = new DOMSource(documento);
			    StreamResult result = new StreamResult(new File("pessoa.xml"));
			    transformer.transform(source, result);

			    System.out.println("Arquivo XML criado com sucesso!");
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}
		
				);
		tela.add(botao);
		tela.add(endereco);
		tela.add(ENDERECO);
		tela.add(IDADE);
		tela.add(idade);
		tela.add(sobreNome);
		tela.add(sobrenome);
		tela.add(nomeP);
		tela.add(nome);
		tela.add(textinho);
		tela.show();
		
	}
	
}
