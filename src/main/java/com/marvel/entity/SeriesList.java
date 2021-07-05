package com.marvel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Entity
public class SeriesList {

    @Id
    @GeneratedValue
    private Long id;

    private Integer available;

    private Integer returned;

    private String collectionUri;

    @OneToMany(mappedBy = "seriesList")
    private List<SeriesSummary> items;

    @OneToOne
    @JoinColumn(name = "character_id")
    private MarvelCharacter character;
}
