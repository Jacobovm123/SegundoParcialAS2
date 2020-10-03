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
public interface InterfazLogin {
    public List listarLogin();
    public Login LoginListarID(int id );
    public String IngresarLogin(String nombre , String apellido,String usuario, String pass, String cargo);
    public String EditarLogin(int id ,String nombre , String apellido,String usuario, String pass, String cargo);
    public Login DeleteLogin(int id );   
    public boolean AutenticacionLogin (String usuario ,String pass);
    
    
}
