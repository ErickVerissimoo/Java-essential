/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erick
 */
public class classeprincipal {

    public static void main(String[] args) throws Exception {
        HttpServer serv = HttpServer.create(new InetSocketAddress("localhost", 4000), 0);
        serv.createContext("/olamundo", (ex) -> {
            String html = """
                         <html><body><p><strong>Ola mundo!</strong></p></body></html
                         """;

            ex.getResponseHeaders().add("Content-Type:", "text/html; charset=UTF-8");

            ex.sendResponseHeaders(200, html.length());
            OutputStream saida = ex.getResponseBody();
            saida.write(html.getBytes());
            saida.close();
        });
     
        System.out.print("Servidor iniciou na porta: " + serv.getAddress().getPort());
   
            
               HttpServer segundo = HttpServer.create(new InetSocketAddress("localhost", 1000), 0); 
        segundo.createContext("/novoHost", (exchange) -> {
                   
                        String simu = "hello world!!";
                        OutputStream fl= exchange.getResponseBody();
                        exchange.sendResponseHeaders(200, simu.length());
                        fl.write(simu.getBytes());
                        fl.close();
                    });
               
                segundo.start();
         
       
        
        serv.start();
        
    }
}
