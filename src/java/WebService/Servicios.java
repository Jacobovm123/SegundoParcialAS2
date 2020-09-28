/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.Factura;
import Modelo.FacturaDAO;
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
    
    
    

}
