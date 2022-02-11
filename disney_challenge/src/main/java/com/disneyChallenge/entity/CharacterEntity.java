package com.disneyChallenge.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Entity
@Table( name="disney_character", catalog = "disney")

@Getter
@Setter

public class CharacterEntity {

    @Id
    @Column(name="id_character")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long idCharacter;

    @Column(name="image_url")
    private String imageURL;

    private String name;

    private int age;

    private float weight; //kgs

    private String story;

    //En este caso los personajes con las mediaTypos son del tipo many to many
    @ManyToMany(mappedBy = "characters" , cascade = CascadeType.ALL)
    private List<MediaEntity> medias= new ArrayList<>();

    //ADD AND REMOVE PERSONAJES Methods

    // public void addMedias(MediaEntity media){
    //     this.medias.add(media);
    // }

    // public void removeMedias(MediaEntity media){
    //     this.medias.remove(media);
    // }
    
    
}
