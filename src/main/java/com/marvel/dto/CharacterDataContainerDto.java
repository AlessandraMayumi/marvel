package com.marvel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDataContainerDto {

    private Integer offset;
    private Integer limit;
    private Integer total;
    private Integer count;
    private List<MarvelCharacterDto> results;
}

