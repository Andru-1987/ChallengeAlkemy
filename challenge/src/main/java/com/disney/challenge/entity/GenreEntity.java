package com.disney.challenge.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

// State what tyoe of entity and named
// PERSISTENCE JPA
@Entity
@Table(name="genre",catalog = "disney")

// Getters y Setters created and used by Lombok
@Getter
@Setter

public class GenreEntity {
    @Id
    @Column(name="id_genre")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idGenre;

    @Column(name="genre_name",unique = true, nullable = false)
    private String genreName;

    @Column(name="image_url")
    private String imageURL;


}
