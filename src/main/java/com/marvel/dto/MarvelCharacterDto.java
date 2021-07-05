package com.marvel.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class MarvelCharacterDto {

    private String name;
    private LocalDate modified;
    private String resourceURI;
    private List<UrlDto> urls;
    private ImageDto thumbnail;
    private ComicListDto comics;
    private StoryListDto stories;
    private EventListDto events;
    private SeriesListDto series;
}
