/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcs_practica_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco
 */
public class ConexionDB {
    
    public static ConexionDB cx = null;
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static ConexionDB getInstance(){
    if (cx == null){
    cx = new ConexionDB();
    return cx;
    }
    else{
        return null;
    }
    }
    
    private Connection con = null;
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ConexionDB(){
        try {
            String url= "jdbc:mysql://localhost:3306/CRUD?characterEncoding=UTF-8";
            con =DriverManager.getConnection(url, "crud", "password");
            Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO,"se conecto");
        } catch (SQLException ex) {
             Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
public boolean execute(String sql){
Statement st = null;
    try {
        st= con.createStatement();
        st.execute(sql);
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
         return false;
    }
finally {
    if (st!=null)
        try {
        st.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
    }
    }
}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public ResultSet select (String sql){
Statement st = null;
    try {
        st = con.createStatement();
        ResultSet reg = st.executeQuery(sql);
        return reg;
    } catch (SQLException ex) {
         Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
         return null;
    }
} 

}


