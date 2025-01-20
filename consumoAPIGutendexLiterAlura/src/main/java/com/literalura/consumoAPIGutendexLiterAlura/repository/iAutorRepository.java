package com.literalura.consumoAPIGutendexLiterAlura.repository;

import com.literalura.consumoAPIGutendexLiterAlura.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface iAutorRepository extends JpaRepository<com.literalura.consumoAPIGutendexLiterAlura.models.Autor, Long> {

    List<com.literalura.consumoAPIGutendexLiterAlura.models.Autor> findAll();


    List<com.literalura.consumoAPIGutendexLiterAlura.models.Autor> findByCumpleaniosLessThanOrFechaFallecimientoGreaterThanEqual(int anioBuscado, int anioBuscado1);

    Optional<Autor> findFirstByNombreContainsIgnoreCase(String escritor);
}
