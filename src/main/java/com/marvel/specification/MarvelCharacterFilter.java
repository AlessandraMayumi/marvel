package com.marvel.specification;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MarvelCharacterFilter {

    private String name;
    private LocalDate modified;
    private String comics;
    private String stories;
    private String events;
    private String series;
}
