/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.pilhas;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
/**
 *
 * @author Erick
 */
public class queue {
    public static class lidar implements HttpHandler{

        @Override
        public void handle(HttpExchange he) throws IOException {
            String olaMundo = "Hello do servidor";
            he.sendResponseHeaders(200, olaMundo.length());
            OutputStream saida = he.getResponseBody();
            saida.write(olaMundo.getBytes());
            saida.close();
        }
        
    } 
    
    public static void main(String[] args) throws IOException {
        InetSocketAddress endereco = new InetSocketAddress("localhost", 8000);

      HttpServer servidor = HttpServer.create(endereco, 2);
      servidor.createContext("/teste", new lidar());
      servidor.setExecutor(null);
      servidor.start();
    }
    
    
}
