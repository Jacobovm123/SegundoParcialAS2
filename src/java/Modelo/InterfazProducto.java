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
public interface InterfazProducto {
    
      public List listar();
       public List FDlistar();
    public User listarID(int id );
    public String add(String nombre , String descripcion);
    public String edit(int id ,String nombre , String descripcion);
    public User delete(int id );       
}
