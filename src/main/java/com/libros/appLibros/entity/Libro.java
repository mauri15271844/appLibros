package com.libros.appLibros.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Libro {
    @Id
    private Long id;

    @Column
    private String titulo;

    @Column
    private String resumen;

    @Column
    private int capitulos;

    @Column
    private int nro_paginas;

    @Column
    private double calificacion;




    public Libro() {
    }


    public Libro(String titulo, String resumen, int capitulos, int nro_paginas, double calificacion) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.capitulos = capitulos;
        this.nro_paginas = nro_paginas;
        this.calificacion = calificacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getNro_paginas() {
        return nro_paginas;
    }

    public void setNro_paginas(int nro_paginas) {
        this.nro_paginas = nro_paginas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
