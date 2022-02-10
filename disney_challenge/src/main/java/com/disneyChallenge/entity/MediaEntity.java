package com.disneyChallenge.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="media", catalog = "disney")

public class MediaEntity {
    
    @Id
    @Column(name="id_media")
    private Long idMediaEntity;
    
    private String titulo;

    private String imageURL;

    @Column(name="fecha_cracion")
    private LocalDate fechaCreacion;

    private MediaEntity media; // {"pelicula", "serie"}

    private int rating; //from 1 to 5

    // Establezco la relacion de cardinalidad
    
    

}
