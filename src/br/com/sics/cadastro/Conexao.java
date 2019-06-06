
package br.com.sics.cadastro;

import java.sql.*;



public class Conexao {
    
    public static Connection getConnection(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_teste","root","");
            
            
            
            
        } catch(SQLException | ClassNotFoundException cx){
            
            cx.printStackTrace();
            
            throw new RuntimeException();
        }
        
        
    }
    
}
