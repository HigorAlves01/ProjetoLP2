/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexao {
    private final Connection con;

    /**
     *
     * @return
     */
    public Connection getConexao(){
return con;
}
//public Conexao() throws SQLException, ClassNotFoundException{
//String url="jdbc:mysql://localhost:3306/bdprojetoifsp2?zeroDateTimeBehavior=CONVERT_TO_NULL";
//String driver="com.mysql.cj.jdbc.Driver";
//Class.forName(driver);
//con = DriverManager.getConnection(url, "root", "");
//}
public Conexao() throws SQLException, ClassNotFoundException{
    String url="jdbc:postgresql://localhost:5432/projetocompra";
    String driver= "org.postgresql.Driver";
    Class.forName(driver);
    con = DriverManager.getConnection(url, "postgres", "postdba");
}
    
}
