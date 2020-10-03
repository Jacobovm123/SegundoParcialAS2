/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author jacob
 */
public class LoginDAO implements InterfazLogin  {
    
    PreparedStatement ps;
ResultSet rs;
Connection con;
Conexion conex = new Conexion ();
int res;
String msj;
Login login= new Login();
    

    @Override
    public List listarLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login LoginListarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String IngresarLogin(String nombre, String apellido, String usuario, String pass, String cargo) {
        String sql="insert into usuario ( nombre, apellido,usuario,pass,cargo ) values(?,?,?,?,?)";
        
        try {
            
            con= conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
               ps.setString(2,apellido);
               ps.setString(3,usuario);
               ps.setString(4,pass);
               ps.setString(5,cargo);
            
           res=ps.executeUpdate();
           
           if(res==1){
           msj="usuario agregado";
           }else{
           
           msj="usuarion no agregado";
                   }
            
        
        } catch (Exception e){
        
        }
        return msj;
    }

    @Override
    public String EditarLogin(int id, String nombre, String apellido, String usuario, String pass, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login DeleteLogin(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AutenticacionLogin(String usuario, String pass) {
       
          String sql="select * from db_patron.usuario where usuario=? and pass=?";
try{
    con =conex .getConnection();
    ps=con.prepareStatement(sql);
    //rs=ps.executeQuery();
            ps.setString(1, usuario);
            ps.setString(2, pass);
             rs=ps.executeQuery();
           //  res= ps.executeQuery();
            if (rs.absolute(1)){
            return true;
            }
}

catch
   (Exception e){
    
    
}

return false; 
        
       
    }
    
}
