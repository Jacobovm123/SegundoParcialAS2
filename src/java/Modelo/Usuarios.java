/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jacob
 */
public class Usuarios {
     int id;
    String usuario;
    String pass;
    
    public Usuarios (){
    
    
    }
  public Usuarios ( int id, String usuario, String pass ){
    
    this.id= id;
    this.usuario=usuario;
            
    this.pass=pass;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  
  
}
