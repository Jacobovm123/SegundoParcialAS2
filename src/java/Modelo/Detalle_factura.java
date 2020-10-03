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
public class Detalle_factura {
      int id;
    int id_factura;
    int id_producto;
    
    String cantidad ;
    String precio;
    String nombre;
    String nombrep;
    String marca;
    String descripcion;
    String total;
    
    public Detalle_factura  (){
    
    
    }
  public Detalle_factura  ( int id, int id_factura,int id_producto,String cantidad, String precio,String nombre,String nombrep,String marca,String descripcion, String total ){
    
    this.id= id;
    this.id_factura=id_factura;
    this.id_producto=id_producto;
    this.cantidad=cantidad;
    this.precio=precio;
    this.nombre=nombre;
    this.nombrep=nombrep;
    this.marca=marca;
    this.descripcion=descripcion;
    this.total=total;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }
  
  
  
  
}
