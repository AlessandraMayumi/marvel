package com.marvel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class Image {

    @Id
    @GeneratedValue
    private Long id;

    private String path;

    private String extension;

    @OneToOne
    @JoinColumn(name = "character_id")
    private MarvelCharacter character;
}

