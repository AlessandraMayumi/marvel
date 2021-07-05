package com.marvel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComicListDto {

    private Integer available;
    private Integer returned;
    private String collectionUri;
    private List<ComicSummaryDto> items;
}

