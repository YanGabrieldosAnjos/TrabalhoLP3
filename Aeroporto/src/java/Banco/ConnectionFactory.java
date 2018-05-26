/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
//     private static final String DRIVER = "com.mysql.jdbc.Driver";
//    public static Connection getConnection(){
//        Connection conn = null;
//        try{
//        Class.forName(DRIVER);//ta ligado com a conexao deixa q eu to fazendo  
//        //jdbc:mysql://localhost:3306/mydb
//        //jdbc:mysql://localhost
//        //qual a certa connection factory 1 ou connection factory?
//        return  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/startv", "root", "lokiodin09"); // acho q ta aqui o erro
//        } 
//        catch (SQLException ex){
//            System.out.println("Erro com conexao do banco "+ ex);
//        }
//        finally{
//            //return conn;       
//        }
//    }
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/aeroporto";
    private static final String USER = "root";
    private static final String PASS = "lokiodin09";
    // é mt difi
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        } // viu q printou erro na conexao???
    }
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


