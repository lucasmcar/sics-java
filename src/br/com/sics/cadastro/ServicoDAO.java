
package br.com.sics.cadastro;

import java.sql.*;


public class ServicoDAO {
    
    private Connection con = Conexao.getConnection();
    
    public void cadastrar(Servico servico){
        
        String sql = "INSERT INTO tb_servico (nome, descricao) VALUES (?,?);";
        
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, servico.getNome());
            pst.setString(2, servico.getDescricao());
            
            pst.execute();
            pst.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
