package com.mycompany.javaadvanced.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;


public class Person {
 @Expose(deserialize=false)
    private String name;
    private int idade;
      
    private double altura;
 
   public Person(String name, int idade, double altura){
	  
           this.name=name;
	   this.idade=idade;
	   this.altura=altura;
   }
    
    
    
    public static void main(String[] args) {
        Gson objeto = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Person pessoa = new Person("Erick", 18, 1.77);
        String json = objeto.toJson(pessoa);
        System.out.println(json);
        //String oe = System.getProperty("os.name");
        //System.out.println(oe);
        
    }
}