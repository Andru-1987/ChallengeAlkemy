package com.disney.challenge.service.impl;

import com.disney.challenge.dto.GenreDTO;
import com.disney.challenge.entity.GenreEntity;
import com.disney.challenge.mapper.GenreMapper;
import com.disney.challenge.repository.GenreRepository;
import com.disney.challenge.service.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreMapper genreMapper;
    @Autowired
    private GenreRepository genreRepository;


    public GenreDTO save(GenreDTO dto){

//        Lo convierto en entity
        GenreEntity entity= genreMapper.genreDTOtoEntity(dto);
//        Me devuelve una entidad guardad
        GenreEntity entitySaved= genreRepository.save(entity);
//        Me devuelve la entidad guardad en un dto
        GenreDTO genreDTOResultado= genreMapper.genreEntityToDTO(entitySaved);

        return genreDTOResultado;
    }

    @Override
    public List<GenreDTO> getAllGenres() {
        List<GenreEntity> genreEntities=genreRepository.findAll();
        List<GenreDTO> dtoResult=genreMapper.genreEntityToDTOList(genreEntities);
        return dtoResult;
    }
}
