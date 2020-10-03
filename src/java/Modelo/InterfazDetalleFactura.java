/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author jacob
 */
public interface InterfazDetalleFactura {
     public List listar();
       public List FDlistar();
       
       public List DFListar();
    public Detalle_factura FDlistarID(int id );
    public String addDF(String id_factura, String id_producto,String cantida , String precio);
    public String editardetallefactura(int id ,String descripcion, String nombre , String nombrep ,String marca,String cantida , String precio , String total);
    public String ActualizarDF1 ( int id, int id_factura, int id_producto, String cantidad, String precio);
    public Detalle_factura deleteDF(int id );   
}
