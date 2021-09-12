/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import model.Usuario;

/**
 *
 * @author Usuario
 */
public class UsuarioData extends Conexao{
     public UsuarioData() throws Exception {}
     public boolean incluir (Usuario obj) throws Exception{
        String sql ="Insert into usuario (nome,email,senha,endereco,telefone) "
                + "values(?,?,?,?,?,?)";
        PreparedStatement ps =getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setString(3, obj.getSenha());
        ps.setString(4, obj.getEndereco());
        ps.setInt(5, obj.getTelefone());
        
        return ps.executeUpdate()>0;
    }  
        
    }
    
