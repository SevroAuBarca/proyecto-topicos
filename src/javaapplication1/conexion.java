/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class conexion {
       
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    public void conexion() throws SQLException {
               
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:3306/proyectoU5";
            con= DriverManager.getConnection(url, "root", "");
            stmt=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
      
    }
    
    public void Desconectar(){
       try {
        if(con != null){
            if(stmt != null){
                    stmt.close();      
            }
            con.close();
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
            }
    }
   

}
