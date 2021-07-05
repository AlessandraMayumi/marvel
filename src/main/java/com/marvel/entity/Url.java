package com.marvel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Url {

    @Id
    @GeneratedValue

    private Long id;

    private String type;

    private String url;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private MarvelCharacter character;
}

