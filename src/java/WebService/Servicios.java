/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.Detalle_factura;
import Modelo.Detalle_facturaDAO;
import Modelo.Factura;
import Modelo.FacturaDAO;
import Modelo.LoginDAO;
import Modelo.User;
import Modelo.UserDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Servicios")
public class Servicios {
UserDAO dao = new UserDAO();
FacturaDAO dao1= new FacturaDAO();
Detalle_facturaDAO dao2= new Detalle_facturaDAO();
LoginDAO dao3 = new LoginDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public List<User> listar() {
     List datos= dao.listar();
     return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
      String datos=dao.add(nombre, descripcion);
      
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarID")
    public User ListarID(@WebParam(name = "id") int id) {
 
        User user=dao.listarID(id);
        
        return user ;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
       String datos=dao.edit(id, nombre, descripcion);
       
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public User Eliminar(@WebParam(name = "id") int id) {
        User u =dao.delete(id);
        
        return u;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Flistar")
    public List<Factura> Flistar() {
       List datos= dao1.Flistar();
     return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FDlistar")
    public List<Detalle_factura> FDlistar() {
         List datos2= dao2.FDlistar();
        return datos2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FDlistarID")
    public Detalle_factura FDlistarID(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        
        Detalle_factura detallefactura= dao2.FDlistarID(id);
        return detallefactura;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarDF")
    public String ActualizarDF(@WebParam(name = "id") int id, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "nombre") String nombre, @WebParam(name = "nombrep") String nombrep, @WebParam(name = "marca") String marca, @WebParam(name = "cantidad") String cantidad, @WebParam(name = "precio") String precio, @WebParam(name = "total") String total) {
        //TODO write your implementation code here:
        
        String datos2=dao2.editardetallefactura(id, descripcion, nombre, nombrep, marca, cantidad, precio, total);
        
        return datos2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregardf")
    public String agregardf(@WebParam(name = "id_factura") String id_factura, @WebParam(name = "id_producto") String id_producto, @WebParam(name = "cantidad") String cantidad, @WebParam(name = "precio") String precio) {
         String datos2=dao2.addDF(id_factura, id_producto, cantidad, precio);
      
        return datos2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarLogin")
    public String IngresarLogin(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass, @WebParam(name = "cargo") String cargo) {
    String datos2=dao3.IngresarLogin(nombre, apellido, usuario, pass, cargo);
      
        return datos2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AutenticacionLogin")
    public boolean AutenticacionLogin(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass) {
       boolean datos3=dao3.AutenticacionLogin(usuario, pass);
       
        return datos3;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarDF1")
    public String ActualizarDF1(@WebParam(name = "id") int id, @WebParam(name = "id_factura") int id_factura, @WebParam(name = "id_producto") int id_producto, @WebParam(name = "cantidad") String cantidad, @WebParam(name = "precio") String precio) {
       String datos2=dao2.ActualizarDF1(id, id_factura, id_producto, cantidad, precio);
       
        return datos2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteDF")
    public Detalle_factura deleteDF(@WebParam(name = "id") int id) {
       Detalle_factura u =dao2.deleteDF(id);
        
        return u;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DFListar")
    public List<Detalle_factura> DFListar() {
        List datos2= dao2.DFListar();
     return datos2;
    }

    
    
    /**
     * Web service operation
     */
  

    /**
     * Web service operation
     */

    
   
    

}
