/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcs_practica_01;

/**
 *
 * @author francisco
 */
public class Empleado {
   //definicion de pojo sin mas funcionalidad que no sean propiedades 
    private String calve;
    private String nombre;
    private String direccion;
    private String telefono;
    //propiedad=atributo, set y get

    public String getCalve() {
        return calve;
    }

    public void setCalve(String calve) {
        this.calve = calve;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
