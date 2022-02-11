package com.disneyChallenge.entity;

import javax.persistence.*;
import lombok.*;


// Persistence JPA
@Entity
@Table(name="genre",catalog ="disney")

// Usando Lombok
@Getter
@Setter

public class GenreEntity {
    @Id
    // por lo general hace falta llamarlo (pero por razones de aprendizaje)
    @Column(name="id_genre")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long idGenre;
    @Column(name="name", nullable = false)
    private String name;

    @Column(name="image_url")
    private String imageURL;
}
