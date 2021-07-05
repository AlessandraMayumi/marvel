package com.marvel.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class MarvelCharacter {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @LastModifiedDate
    private LocalDate modified;

    private String resourceURI;

    @ManyToOne
    @JoinColumn(name = "character_data_container_id")
    private CharacterDataContainer data;

    @OneToMany(mappedBy = "character")
    private List<Url> urls;

    @OneToOne(mappedBy = "character")
    private Image thumbnail;

    @OneToOne(mappedBy = "character")
    private ComicList comics;

    @OneToOne(mappedBy = "character")
    private StoryList stories;

    @OneToOne(mappedBy = "character")
    private EventList events;

    @OneToOne(mappedBy = "character")
    private SeriesList series;
}

