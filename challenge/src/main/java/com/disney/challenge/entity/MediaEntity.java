package com.disney.challenge.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.disney.challenge.enums.MediaType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;


@Entity
@Table(name="media", catalog = "disney")

@Getter
@Setter

public class MediaEntity {
    @Id
    @Column(name="id_media")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long idMediaEntity;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="image_url")
    private String imageURL;

    @Column(name="release_date")
    @DateTimeFormat(pattern="YYYY/MM/DD")

    private LocalDate releaseDate;

    private MediaType media; // {"pelicula", "serie"}

    private int rating; // {from1 to 5}

    // Establezco la relacion de cardinalidad
    // El cual basicamente estaría obteniendo data del genero

    //Aun me falta por definir que tipo de cascade sería para la bidireccionalidad
    @ManyToOne(

        fetch= FetchType.EAGER
        // cascade = CascadeType.ALL  !!No se permite pues no queremos que se borre el género
        )

    //defino los valores para no ser modificados
    @JoinColumn(
        name = "id_genre",
        insertable = false,
        updatable = false
    )
    private GenreEntity genre;

    //guardo y actualizo id
    @Column(name="id_genre", nullable = false)
    private Long idGenre;


    // Con esto genero una relacion entre muchos a muchos en este caso
    // es nuestros personajes junto a nuestro tipo de media
    // Creamos una media y creamos los personajes, y no crear un personaje
    // y crear una pelicula

    @ManyToMany(
        fetch = FetchType.LAZY,

        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        }
    )

    // La tabla intermedia
    // Por la relacion
    @JoinTable(
        name="media_character",
        joinColumns = @JoinColumn(name="id_media"),
        inverseJoinColumns = @JoinColumn(name="id_character")
    )

    private Set<CharacterEntity> characters=new HashSet<>();


}
