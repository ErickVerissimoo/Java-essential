package com.mycompany.javaadvanced.Json;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
public final class HelloJson {

	public static void main(String[] args) throws IOException {
			
		 File arquivo = new File("/home/gil/NetBeansProjects/JavaAdvanced/src/main/java/com/mycompany/javaadvanced/Json/arquivoNew.json");
		 arquivo.createNewFile();
		 BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo));
		 final String jeison = """
		 		{
		 		"nome": "calabreso",
		 		"idade": 23
		 		}
		 		""";
		 
		 escritor.write(jeison);
		 escritor.close();
	}

}
