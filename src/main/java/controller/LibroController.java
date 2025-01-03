package com.liter_alura.controller;

import com.liter_alura.entity.Libro;
import com.liter_alura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/idioma/{idioma}")
    public List<Libro> obtenerLibrosPorIdioma(@PathVariable String idioma) {
        return libroService.obtenerLibrosPorIdioma(idioma);
    }

    @GetMapping("/buscar/{titulo}")
    public List<Libro> buscarPorTitulo(@PathVariable String titulo) {
        return libroService.buscarPorTitulo(titulo);
    }

    @PostMapping("/guardar")
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroService.guardarLibro(libro);
    }
}
