/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Factura {
        int id;
    int id_cliente;
    String fecha;
    String  total ;
    String nombre;
    
    public Factura  (){
    
    
    }
  public Factura  ( int id, int id_cliente ,String fecha, String total, String nombre ){
    
    this.id= id;
    this.id_cliente=id_cliente;
    this.fecha=fecha;
    this.total=total;
    this.nombre=nombre;
    
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
  
  
  
  
  
}
