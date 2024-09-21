/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.MoreAboutStrings;

/*
A importação estatica é útil para importar metodos
estaticos diretamente
*/
import static com.mycompany.javaadvanced.Numbers.Integers.*;

/**
 *
 * @author Erick
 */
public class Strings {
    public static void main(String[] args) {
     char[] palavra2 = {'c','a','r','a','c','t','e','r'};
    
     String palavra = "qualquer";
      /*
     Compara uma String com uma sequencia de chars
     */
     print (palavra.contentEquals("palavra"));
     // Retorna a posição correspondente
     print("qualquerCoisa".charAt(0));
     // Transforma uma String em uma String de letras
     // maiusculas
     print("Uma palavra".toUpperCase());
     // Verifica se uma string termina com determinado caractere
     print("P a l a v r a".endsWith("a"));
     /*
     Troca uma parte da String. Primeiro passa-se a 
     parte a ser trocada, depois o que irá ser colocado
     no lugar.
     */
     print("calma calabreso".replace("calabreso", "casco de balo"));
     //Retorna a posição em que determinado caractere
     // se encontra dentro da string
     print("java é legal".indexOf("é"));
     /*
     O metodo split separa uma String em substrings derivadas,
     e você quem decide qual será o parametro da separação,
     neste caso, a virgula. Ou seja, sempre que for encontrado
     uma virgula na string abaixo, aquela palavra é colocada dentro
     do array e continua assim até a string acabar.
     */
     var palabra = "Java, html, css, python";
     String[] palabras = palabra.split(",");
     for(String linguagem : palabras){
     print(linguagem.strip());
    }
     /*
     Remove espaços desnecessários de uma string
     */
    print("                This is Java                   ".strip());
    /*
    Retorna uma sequencia contida dentro da String. Primeiro
    passa-se a partir de onde se inicia a sequencia, e a partir dali
    segue-se a String. Também é possivel colocar outro parametro,
    determinando onde começa e onde termina a string. Aqui retorna-se
    uma sequencia de char 
    */
    print("Frase qualquer".subSequence(1, 7));
    /*
    Cria uma substring derivada de uma outra string, bem
    semelhante ao anterior. o que difere é que aqui retorna-se
    uma String propriamente
    */
    print("Isto é java".substring(2));
    /*
    Repete uma String quantas vezes você quiser
    neste caso a frase abaixo será imprimida
    quatro vezes numa mesma linha. 
    */
    print("Isso é uma frase".repeat(4));
    /*
    É possivel converter um array de char para 
    uma string simplesente instanciando uma String e 
    passando o array de char dentro do construtor da string
    */
    String PALAVRA = new String(palavra2);
    print(PALAVRA);
    /*
    Aqui eu criei uma substring a partir da posicao 24 ate a 26,
    e a coloquei dentro de uma nova variavel.
    */
    var novaString = "Linguagem de programação Java".substring(24, 26);
    print(novaString);
    }
}