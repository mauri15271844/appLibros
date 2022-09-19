package com.libros.appLibros.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empresa {

    @Id
    private int id;
    private String nonbre;
    private int nit;
    private String direccion;
    private String correo;


    public Empresa() {
    }


    public Empresa(String nonbre, int nit, String direccion, String correo) {
        this.nonbre = nonbre;
        this.nit = nit;
        this.direccion = direccion;
        this.correo = correo;
    }


    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
