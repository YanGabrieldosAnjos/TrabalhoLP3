/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import Negocio.Reclamacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author YAN
 */
public class ReclamacaoDAO {
    private int i=2;
    public boolean  incluir(Reclamacao r){
    String sql = "insert into aeroporto.reclamacao (codReclamacao,codCheckin,dataReclamacao,descricaoProblema,codStatusRec) values (?,?,?,?,'aberto')";
    PreparedStatement p= null;
      try{
       
      Connection conn = ConnectionFactory.getConnection();
          System.out.println(conn); // conn ta null
       p = conn.prepareStatement(sql); //ta dando erro de ponteiro nulo aqui
          //System.out.println(p);
        p.setString(1,r.getIdPassagem()+i);
        i=i+1;
        p.setString(2,r.getIdPassagem());
        p.setString(3,r.getData());
        p.setString(4,r.getReclamacao());
        p.executeUpdate();
          
           return true;
       }
       catch(SQLException ex){
           System.out.println("Erro ao incluir no banco " + ex);
           return false;
       }
       finally{
       
       }
    }
}
