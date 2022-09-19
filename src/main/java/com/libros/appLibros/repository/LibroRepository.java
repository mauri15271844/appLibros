package com.libros.appLibros.repository;

import com.libros.appLibros.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {


}
