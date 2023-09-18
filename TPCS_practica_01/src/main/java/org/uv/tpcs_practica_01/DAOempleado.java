
package org.uv.tpcs_practica_01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco
 */
public class DAOempleado implements IDAO <Empleado, Long> {

    @Override
    public  Empleado save(Empleado pojo) {
        ConexionDB con = ConexionDB.getInstance();
        String sql = "insert into usuario(clave, nombre, direccion, telefono) values ('" +pojo.getCalve() +"','"+pojo.getNombre()+"','"+pojo.getDireccion()+ "','" +pojo.getTelefono()+"')";
        boolean res = con.execute(sql);
        if (res){
         Logger.getLogger(DAOempleado.class.getName()).log(Level.INFO,"guardado");
        }
        else {
         Logger.getLogger(DAOempleado.class.getName()).log(Level.INFO,"error");
         return pojo;
        }
       return null;
    }
   
   

    public Empleado delete(int id) {
         ConexionDB con = ConexionDB.getInstance();
        String sql = "delete from usuario where clave ="+id;
        boolean res = con.execute(sql);
          if (res){
          Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO,"se guardo");
        }
             else {
         Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO,"error...");
        }
      return null; 
    }

    @Override
    public List<Empleado> findbyId(int id) {
       try {
             ConexionDB con = ConexionDB.getInstance();
        ResultSet reg = con.select("select * from usuario where clave = "+id);
        List<Empleado> stEmpleado = new ArrayList<>();
       while (reg.next()){
       Empleado emp=new Empleado();
       emp.setCalve( reg.getString(1));
       emp.setNombre(reg.getString(2));
       emp.setDireccion(reg.getString(3));
       emp.setTelefono(reg.getString(4));
       stEmpleado.add(emp);
       }
       return  stEmpleado;
        }
         catch (SQLException ex) {
     Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
    return null;
        
}
       
    }

    @Override
    public List<Empleado> findall() {
 try {
             ConexionDB con = ConexionDB.getInstance();
        ResultSet reg = con.select("select * from usuario");
        List<Empleado> stEmpleado = new ArrayList<>();
       while (reg.next()){
       Empleado emp=new Empleado();
       emp.setCalve( reg.getString(1));
       emp.setNombre(reg.getString(2));
       emp.setDireccion(reg.getString(3));
       emp.setTelefono(reg.getString(4));
       stEmpleado.add(emp);
       }
       return  stEmpleado;
        }
         catch (SQLException ex) {
     Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
    return null;
        
}    
    }


    public Empleado update(Empleado pojo, int id) {
         ConexionDB con = ConexionDB.getInstance();
        String sql = "update  usuario set nombre, direccion, telefono where clave= "+id+"( nombre, direccion, telefono) values ('"+pojo.getNombre()+"','"+pojo.getDireccion()+ "','" +pojo.getTelefono()+"')";
        boolean res = con.execute(sql);
        if (res){
          Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO,"se guardo");
        }
        else {
         Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO,"error...");
         return pojo;
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado update(Empleado pojo, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado delete(int id, Empleado pojo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}





