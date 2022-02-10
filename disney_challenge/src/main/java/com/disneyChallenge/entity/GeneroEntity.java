package com.disneyChallenge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

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
    PersonajeEntity personaje;
    
}
