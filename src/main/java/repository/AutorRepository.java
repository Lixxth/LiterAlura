package com.liter_alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liter_alura.entity.Autor;
import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findByAnioNacimientoLessThanEqualAndAnioFallecimientoGreaterThanEqual(int anio, int anio2);
    List<Autor> findByAnioFallecimientoIsNull();
}
