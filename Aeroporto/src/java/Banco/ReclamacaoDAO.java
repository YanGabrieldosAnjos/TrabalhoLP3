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
import java.util.ArrayList;
/**
 *
 * @author YAN
 */
public class ReclamacaoDAO {
    public boolean  incluir(Reclamacao r){
    String sql = "insert into aeroporto.reclamacao (codReclamacao,codCheckin,dataReclamacao,descricaoProblema,codStatusRec) values (0,?,?,?,'aberto')";
    PreparedStatement p= null;
      try{
       
      Connection conn = ConnectionFactory.getConnection();
          System.out.println(conn); // conn ta null
       p = conn.prepareStatement(sql); //ta dando erro de ponteiro nulo aqui
          //System.out.println(p);
       
        p.setString(1,r.getIdPassagem());
        p.setString(2,r.getData());
        p.setString(3,r.getReclamacao());
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
    public ArrayList<Reclamacao> consultaTodos(Reclamacao r){
        ArrayList <Reclamacao> reclamacoes= new ArrayList<>();
        String sql= ("select reclamacao.codCheckin , statusreclamacao.nomeStatus , reclamacao.descricaoProblema, reclamacao.dataReclamacao from aeroporto.reclamacao inner join aeroporto.statusReclamacao on reclamacao.codStatusRec=statusreclamacao.codStatusRec where reclamacao.codCheckin=?");
        Connection conn = ConnectionFactory.getConnection();
     
     
      try{ 
        PreparedStatement p = conn.prepareStatement(sql);
       p.setString(1,r.getIdPassagem());
       ResultSet rs = p.executeQuery();
     
          System.out.println();
      
       while (rs.next()){   
         Reclamacao  c1= new  Reclamacao();      
         c1.setIdPassagem(rs.getString("codCheckin"));
         c1.setReclamacao(rs.getString("descricaoProblema"));
         c1.setData(rs.getString("dataReclamacao"));
         
        reclamacoes.add(c1);
        
       }
     
       }
       catch(SQLException e){
           
       }
       return reclamacoes;
       
        
    }
    /*public static void main(String args[]){
        ArrayList<Reclamacao> recs= new ArrayList<>();
        Reclamacao r= new Reclamacao();
        r.setIdPassagem("2");
        recs=r.pesquisarTodos();
        System.out.println(recs.get(1).getReclamacao());
        System.out.println(recs.get(2).getReclamacao());
    }*/
}
