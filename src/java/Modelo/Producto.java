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
public class Producto {
     int id;
     int  Id_categoria;
    String nombre;
    String marca;
    String stock;
    
    public Producto (){
    
    
    }
  public Producto ( int id,int id_categoria, String nombre, String marca, String stock ){
    
    this.id= id;
    this.Id_categoria=id_categoria;
    this.nombre=nombre;
    this.marca=marca;
    this.stock=stock;
    
    
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_categoria() {
        return Id_categoria;
    }

    public void setId_categoria(int Id_categoria) {
        this.Id_categoria = Id_categoria;
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
  
  
}
