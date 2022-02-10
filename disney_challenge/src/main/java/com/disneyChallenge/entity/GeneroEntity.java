package com.disneyChallenge.entity;

import javax.persistence.*;
import lombok.*;


// Persistence JPA
@Entity
@Table(name="genero",catalog ="disney")

// Usando Lombok
@Getter
@Setter

public class GeneroEntity {
    @Id
    // por lo general hace falta llamarlo (pero por razones de aprendizaje)
    @Column(name="id_genero")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    Long idGenero;

    String nombre;
    String imageURL;
}
