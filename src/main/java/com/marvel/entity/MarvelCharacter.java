package com.marvel.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class MarvelCharacter {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @LastModifiedDate
    private LocalDate modified;

    private String resourceURI;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_data_container_id")
    private CharacterDataContainer data;

    @ToString.Exclude
    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL)
    private List<Url> urls = new ArrayList<>();

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private Image thumbnail;

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private ComicList comics;

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private StoryList stories;

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private EventList events;

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private SeriesList series;
}

