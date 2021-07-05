package com.marvel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComicList {

    @Id
    @GeneratedValue
    private Long id;

    private Integer available;

    private Integer returned;

    private String collectionUri;

    @OneToOne
    @JoinColumn(name = "character_id")
    private MarvelCharacter character;

    @OneToMany(mappedBy = "comicList", cascade = CascadeType.ALL)
    private List<ComicSummary> items;
}

