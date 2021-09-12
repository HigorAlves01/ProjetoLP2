/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.item;
/**
 *
 * @author Usuario
 */
public class itenData extends Conexao{
 

    /**
     *
     * @throws Exception
     */
    public itenData() throws Exception {}
     public boolean incluir (item obj) throws Exception{
        String sql ="Insert into itens (nome,valor,estadoitem) "
                + "values(?,?,?)";
        PreparedStatement ps =getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setDouble(2, obj.getValor());
        ps.setInt(3, obj.getEstadoitem());
        
        return ps.executeUpdate()>0;
    }  
      public ArrayList<item> pesquisar(String pesq) throws Exception {
        ArrayList<item> listaitens=new ArrayList<>();
        String sql="Select * from itens where nome like '"+pesq+"%' order by nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
    while(rs.next()){
        item obj = new item(rs.getString("Nome"),rs.getInt("Valor"),rs.getInt("EstadoItem"));
        listaitens.add(obj);
}
return listaitens;
}
    
}
