/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import Negocio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author YAN
 */
public class ClienteDAO {
    public  Cliente login(Cliente c){
        String sql= ("select  * from aeroporto.cliente where cliente.email='?' and cliente.CPF='?'");
        Connection conn = ConnectionFactory.getConnection();
         try{ 
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1,c.getEmail());
            p.setString(2,c.getCpf());
            ResultSet rs = p.executeQuery();
            c.setCpf(rs.getString("CPF"));
            c.setDtNasc(rs.getString("nascimento"));
            c.setEmail(rs.getString("email"));
            c.setNome(rs.getString("nome"));
         }catch(SQLException e){
             
         }
         return c;
    }
    
}
