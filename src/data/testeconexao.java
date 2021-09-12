/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class testeconexao {
    public static void main(String[] args) {
try {
Conexao c = new Conexao();
System.out.println("Conexão ok.");
String sql="insert into usuario (idusuario,nome,senha,endereco,email,telefone) "
        + "values (1,'jose',12314,'Rua N','jose@bom.com',123124253)";
PreparedStatement ps = c.getConexao().prepareStatement(sql);
if(ps.executeUpdate()>0)
System.out.println("Registro salvo com sucesso!");
else
System.out.println("Erro ao salvar.");
} catch (ClassNotFoundException | SQLException ex) {
System.out.println("Erro: "+ex.getMessage()); }
}
    
}
