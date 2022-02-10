package com.disneyChallenge.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name="personaje", catalog = "disney")
@Getter
@Setter

public class PersonajeEntity {

    @Id
    @Column(name="id_personaje")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPersonaje;

    
    private String imageURL;
    private String nombre;
    private int edad;
    private float peso; //kgs
    private String historia;

    //En este caso los personajes con las mediaTypos son del tipo many to many
    @ManyToMany(mappedBy = "personajes" , cascade = CascadeType.ALL)
    private List<MediaEntity> medias= new ArrayList<>();

    //ADD AND REMOVE PERSONAJES Methods

    public void addMedias(MediaEntity media){
        this.medias.add(media);
    }

    public void removeMedias(MediaEntity media){
        this.medias.remove(media);
    }
    
    
}
