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

/**
 *
 * @author jacob
 */
public class Detalle_facturaDAO implements InterfazDetalleFactura{
    
        PreparedStatement ps;
ResultSet rs;
Connection con;
Conexion conex = new Conexion ();
int res;
String msj;
Detalle_factura detalle_factura= new Detalle_factura();

    @Override
    public List listar() {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List FDlistar() {
           List <Detalle_factura> datos2= new ArrayList <>();
          //List <Cliente> datoss= new ArrayList <>();
        String sql="select categoria.descripcion,categoria.nombre,producto.nombre,producto.marca,factura_detalle.cantidad,factura_detalle.precio,(cantidad*precio) as total\n" +
" from db_patron.factura_detalle,db_patron.producto,db_patron.categoria,db_patron.factura\n" +
" where factura_detalle.id_producto=producto.id_producto\n" +
" and producto.id_categoria= categoria.id_categoria\n" +
" and  factura_detalle.id_factura= factura.id_factura  and  factura_detalle.id_factura=\"1\"";
        try
        {
            con =conex .getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
           Detalle_factura u= new  Detalle_factura();
           // u.setId(rs.getInt("id_factura_detalle"));
              u.setDescripcion(rs.getString("descripcion"));
              u.setNombre(rs.getString("categoria.nombre"));
              u.setNombrep(rs.getString("producto.nombre"));
              u.setMarca(rs.getString("marca"));
              u.setCantidad(rs.getString("cantidad"));
              u.setPrecio(rs.getString("precio"));
              u.setTotal(rs.getString("total"));
          
            datos2.add(u);
            
            
            
            }
        } catch (Exception e){
        }
        
        return datos2;
    }

    @Override
    public Detalle_factura FDlistarID(int id) {
           String sql=" select * from db_patron.factura_detalle where id_factura_detalle="+id;
try{
    con =conex .getConnection();
    ps=con.prepareStatement(sql);
    rs=ps.executeQuery();
            while(rs.next()){
        detalle_factura.setId(rs.getInt("id_factura_detalle"));
        
        detalle_factura.setId_factura(rs.getInt("id_factura"));
        detalle_factura.setId_producto(rs.getInt("id_producto"));
        detalle_factura.setCantidad(rs.getString("cantidad"));
        detalle_factura.setPrecio(rs.getString("precio"));
                                  
}
}

catch
   (Exception e){
}

return detalle_factura;
    }

    @Override
    public String addDF(String id_factura, String id_producto,String cantidad, String precio) {
        
           
        String sql="insert into factura_detalle (id_factura, id_producto, cantidad, precio) values(?,?,?,?)";
        
        try {
            
            con= conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, id_factura);
               ps.setString(2, id_producto);
               ps.setString(3, cantidad);
               ps.setString(4, precio);
            
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
    public String editardetallefactura(int id, String descripcion, String nombre , String nombrep, String marca , String cantidad, String precio , String total ) {
     /*
        String sql="select categoria.descripcion,categoria.nombre,producto.nombre,producto.marca,factura_detalle.cantidad,factura_detalle.precio,factura.total\n" +
" from db_patron.factura_detalle,db_patron.producto,db_patron.categoria,db_patron.factura\n" +
" where factura_detalle.id_producto=producto.id_producto\n" +
" and producto.id_categoria= categoria.id_categoria\n" +
" and  factura_detalle.id_factura= factura.id_factura \n" +
" and  factura_detalle.id_factura="+id;*/
try{
 con= conex.getConnection();
          //  ps=con.prepareStatement(sql);
            
            ps.setString(1, descripcion);
              ps.setString(2, nombre);
              ps.setString(3, nombrep);
              ps.setString(4, marca);
              ps.setString(5, cantidad);
              ps.setString(6, precio);
              ps.setString(7, total);
              
            
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
    public Detalle_factura deleteDF(int id) {
        
       String sql="delete from db_patron.factura_detalle  where id_factura_detalle ="+id;



try {
    con= conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
    

}

catch(Exception e){
    
    }
return detalle_factura;
 
        
        
        
       
    }

    @Override
    public String ActualizarDF1(int id, int id_factura, int id_producto, String cantidad, String precio) {
        String sql="update db_patron.factura_detalle set id_factura=?, id_producto=?, cantidad=?, precio=?  where id_factura_detalle="+id;
try{
 con= conex.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setInt(1, id_factura);
            ps.setInt(2, id_producto);
            ps.setString(3, cantidad);
            ps.setString(4, precio);
              
            
           res= ps.executeUpdate();
            if(res==1){
            msj="detalle actualizada";

            } else{
           
            msj="detalle no actualidado";
            
            }

}
catch(Exception e){
}
return msj;

    }

    @Override
    public List DFListar() {
        
        
          List <Detalle_factura> datos2= new ArrayList <>();
        String sql="select * from db_patron.factura_Detalle ";
        try
        {
            con =conex .getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Detalle_factura u= new  Detalle_factura();
            u.setId(rs.getInt("id_factura_detalle"));
            u.setId_factura(rs.getInt("id_factura"));
            u.setId_producto(rs.getInt("id_producto"));
            u.setCantidad(rs.getString("cantidad"));
            u.setPrecio(rs.getString("precio"));
            
            datos2.add(u);
            
            }
        } catch (Exception e){
        }
        
        return datos2;
    }
    
}
