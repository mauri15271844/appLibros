package com.libros.appLibros.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correo;

    @Column
     String direccion;

    @Column
    private String cedula;

    @Column
    private String telefono;

    @Column
    private String nacionalidad;






    //--------------------------constructor vacio-----------------------------

    public Autor() {
    }

    //--------------------------constructor-----------------------------------

    public Autor(String nombre, String apellido, String correo, String direccion, String cedula, String telefono, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;

    }
        //get and set----------------------------------------------------------------


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
