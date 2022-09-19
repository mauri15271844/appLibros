package com.libros.appLibros.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee {


    @Id
    private Long id;

    @Column(name = "email", unique = true)
    private String email;



    private Date apdateAt;
    private Date createdAt;


}
