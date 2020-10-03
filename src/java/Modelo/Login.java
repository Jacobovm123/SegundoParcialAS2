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
public class Login {
      int id;
      
      String nombre;
      String apeliido;
    String usuario;
    String pass;
    String cargo;
    
    public Login (){
    
    
    }
  public Login ( int id, String nombre,String apellido,String usuario, String pass,String cargo ){
    
    this.id= id;
    this.nombre= nombre;
    this.apeliido=apellido;
    this.usuario=usuario;
            
    this.pass=pass;
    this.cargo=cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
