/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;


public interface InterfazFactura {
     public List Flistar();
    public User listarID(int id );
    public String add(int id_cliente , String fecha, String total);
    public String edit(int id ,int id_cliente , String fecha, String total);
    public User delete(int id ); 
}
