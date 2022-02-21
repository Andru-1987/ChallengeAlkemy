package com.disney.challenge.controller;

import com.disney.challenge.dto.GenreDTO;
import com.disney.challenge.service.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genres")

public class GenreController {
    
    //Atributo continenteService
    @Autowired
    private GenreService genreService;

    // Method
    // Input es un Id de genreDTO
    // OutPut es un response de tipo DTO
    @PostMapping
    public ResponseEntity<GenreDTO> save(@RequestBody GenreDTO genre){
        // save genre
        // 201, genre save
        // Esto no guarda la logica de guardado, eso se encarga el pack de servicio

        GenreDTO saveGenre=genreService.save(genre);

        return ResponseEntity.status(HttpStatus.CREATED).body(saveGenre);
    }


    @GetMapping
    public ResponseEntity<List<GenreDTO>> getAll(){
        List<GenreDTO> genres=genreService.getAllGenres();

        return ResponseEntity.ok().body(genres);
    };

}
