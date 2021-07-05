package com.marvel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesListDto {

    private Integer available;
    private Integer returned;
    private String collectionUri;
    private List<SeriesSummaryDto> items;
}

