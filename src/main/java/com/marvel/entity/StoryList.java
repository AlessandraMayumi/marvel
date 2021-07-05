package com.marvel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class StoryList {

    @Id
    @GeneratedValue
    private Long id;

    private Integer available;

    private Integer returned;

    private String collectionUri;

    @OneToMany(mappedBy = "storyList", cascade = CascadeType.ALL)
    private List<StorySummary> items;

    @OneToOne
    @JoinColumn(name = "character_id")
    private MarvelCharacter character;
}

