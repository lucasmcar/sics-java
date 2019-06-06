
package br.com.sics.cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CodigoDAO {
    
    private Connection con = Conexao.getConnection();
    
    public void cadastrarCod(Codigo codigo){
        
        String sql = "INSERT INTO tb_codigo (codigo) VALUES (?)";
        
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codigo.getCodigo());
            
            pst.executeUpdate();
            pst.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
