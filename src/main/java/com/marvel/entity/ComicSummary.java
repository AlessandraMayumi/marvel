package com.marvel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Data
@Entity
public class ComicSummary {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceURI;

    private String name;

    @ManyToOne
    @JoinColumn(name = "comic_list_id")
    private ComicList comicList;
}

