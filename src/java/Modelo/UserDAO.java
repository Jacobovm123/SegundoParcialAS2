/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDAO  implements CRUD {
PreparedStatement ps;
ResultSet rs;
Connection con;
Conexion conex = new Conexion ();
int res;
String msj;
User user= new User();



    @Override
    public List listar() {
        List <User> datos= new ArrayList <>();
        String sql="select * from db_patron.categoria ";
        try
        {
            con =conex .getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            User u= new  User();
            u.setId(rs.getInt("id_categoria"));
            u.setNombre(rs.getString("nombre"));
            u.setDescripcion(rs.getString("descripcion"));
            
            datos.add(u);
            
            }
        } catch (Exception e){
        }
        
        return datos;
    }

    @Override
    public User listarID(int id) {
        
        String sql="select * from db_patron.categoria where id_categoria="+id;
try{
    con =conex .getConnection();
    ps=con.prepareStatement(sql);
    rs=ps.executeQuery();
            while(rs.next()){
       
            user.setId(rs.getInt("id_categoria"));
            user.setNombre(rs.getString("nombre"));
            user.setDescripcion(rs.getString("descripcion"));     
}
}

catch
   (Exception e){
}

return user;
    }

    @Override
    public String add(String nombre, String descripcion) {
       
        
        String sql="insert into categoria ( nombre, descripcion ) values(?,?)";
        
        try {
            
            con= conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
               ps.setString(2, descripcion);
            
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
    public String edit(int id, String nombre, String descripcion) {
       
String sql="update db_patron.categoria set nombre=?, descripcion=? where id_categoria="+id;
try{
 con= conex.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, nombre);
              ps.setString(2, descripcion);
              
            
           res= ps.executeUpdate();
            if(res==1){
            msj="categoria actualizada";

            } else{
           
            msj="usuarion no actualidado";
            
            }

}
catch(Exception e){
}
return msj;


    }

    @Override
    public User delete(int id) {
        
String sql="delete from db_patron.categoria  where id_categoria ="+id;



try {
    con= conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
    

}

catch(Exception e){
    
    }
return user;


    }
 
    //consulta de maestro detalle
    
    
    
}
