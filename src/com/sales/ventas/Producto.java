/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.ventas;

/**
 *
 * @author moises
 */
public class Producto {
    // final no se puede modificar ( no puedes setear esta variable)
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    // Agregando construtor
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
        
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}