package com.disney.challenge.service;

import com.disney.challenge.dto.GenreDTO;

import java.util.List;

public interface GenreService {
    
    GenreDTO save(GenreDTO dto);

    List<GenreDTO> getAllGenres();

}
