/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.SQLException;
import java.util.Properties;
import org.postgresql.Driver;
import java.sql.*;
import org.postgresql.PGProperty;
/**
 *
 * @author Erick
 */
public class prank {
    public static void main(String[] args) throws SQLException   
    {
    
        Properties prop = new Properties();
        prop.setProperty("user", "erick");
        prop.setProperty("password", "erick");
        Driver conexao = new Driver();
        Connection ce = conexao.connect("jdbc:postgresql://localhost:5432/postgres", prop);
        System.out.print(ce==null);
    }
  
}
