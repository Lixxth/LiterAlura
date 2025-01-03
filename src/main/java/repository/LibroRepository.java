package com.liter_alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liter_alura.entity.Libro;
import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByIdioma(String idioma);
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
}
