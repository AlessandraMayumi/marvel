package com.marvel.dto;

import com.marvel.entity.ComicList;
import com.marvel.entity.EventList;
import com.marvel.entity.Image;
import com.marvel.entity.SeriesList;
import com.marvel.entity.StoryList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarvelCharacterDto {

    private String name;
    private LocalDate modified;
    private String resourceURI;
    private List<UrlDto> urls;
    private Image thumbnail;
    private ComicListDto comics;
    private StoryListDto stories;
    private EventListDto events;
    private SeriesListDto series;
}
