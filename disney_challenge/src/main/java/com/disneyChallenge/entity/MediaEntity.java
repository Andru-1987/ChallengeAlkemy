package com.disneyChallenge.entity;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import com.disneyChallenge.enums.MediaType;

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

    private int rating; //from 1 to 5

    // Establezco la relacion de cardinalidad
    // El cual basicamente estaría obteniendo data del genero

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    // defino valores para no ser modificados
    @JoinColumn(name="id_genre", insertable = false, updatable = false)
    private GenreEntity genre;

    // guardar y actualizar el id
    @Column(name="id_genre",nullable = false)
    private Long idGenre;


    // Con esto genero una relacion entre muchos a muchos en este caso
    // es nuestros personajes junto a nuestro tipo de media
    // Creamos una media y creamos los personajes, y no crear un personaje
    // y crar una pelicula

    @ManyToMany(
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        }
    )

    // La tabla intermedia. 
    // Por la relacion de muchos a muchos
    @JoinTable(
        name = "media_character",
        joinColumns = @JoinColumn(name="id_media"),
        inverseJoinColumns = @JoinColumn(name="id_character")
    )

    private Set<CharacterEntity> characters= new HashSet<>();


}
