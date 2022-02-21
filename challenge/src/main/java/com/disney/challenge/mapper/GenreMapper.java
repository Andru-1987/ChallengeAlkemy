package com.disney.challenge.mapper;

import com.disney.challenge.dto.GenreDTO;
import com.disney.challenge.entity.GenreEntity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Se encanrga de la conversion de DTO en entidades y viseversa
@Component
public class GenreMapper {

//metodo in DTO
//metodo return una entidad

    public GenreEntity genreDTOtoEntity(GenreDTO dto){
        //Lo qu ehace este método es transformar ese DTO into entity
        GenreEntity genreEntity=new GenreEntity();
        //mapear toda la data que tiene el DTO a la entidad
        genreEntity.setGenreName(dto.getGenreName());
        genreEntity.setImageURL(dto.getImageURL());
        return genreEntity;

    }

    public GenreDTO genreEntityToDTO(GenreEntity entity){

        GenreDTO genreDTO=new GenreDTO();
        genreDTO.setIdGenre(entity.getIdGenre());
        genreDTO.setGenreName(entity.getGenreName());
        genreDTO.setImageURL(entity.getImageURL());

        return genreDTO;
    }

    public List<GenreDTO> genreEntityToDTOList(List<GenreEntity> genresEntities) {
        List<GenreDTO> dtos=new ArrayList<>();
        for(GenreEntity genre:genresEntities){
            dtos.add(this.genreEntityToDTO(genre));
        }
        return dtos;
    }


}
