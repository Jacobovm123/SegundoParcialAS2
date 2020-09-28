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


public class FacturaDAO implements InterfazFactura {
    PreparedStatement ps;
ResultSet rs;
Connection con;
Conexion conex = new Conexion ();
int res;
String msj;
Cliente cliente = new Cliente ();
Factura factura= new Factura();
    
    
    

    @Override
    public List Flistar() {
       
          List <Factura> datos= new ArrayList <>();
          //List <Cliente> datoss= new ArrayList <>();
        String sql="select factura.id_factura,factura.fecha,factura.total,cliente.nombre \n" +
" from db_patron.factura,db_patron.cliente";
        try
        {
            con =conex .getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
           Factura u= new  Factura();
            u.setId(rs.getInt("id_factura"));
            u.setFecha(rs.getString("fecha"));
            u.setTotal(rs.getString("total"));
            u.setNombre(rs.getString("nombre"));
            datos.add(u);
            
            
            
            }
        } catch (Exception e){
        }
        
        return datos;
    }

    @Override
    public User listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(int id_cliente, String fecha, String total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int id, int id_cliente, String fecha, String total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
