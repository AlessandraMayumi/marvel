package com.marvel.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ComicListDto {

    private Integer available;
    private Integer returned;
    private String collectionUri;
    private List<ComicSummaryDto> items;
}
