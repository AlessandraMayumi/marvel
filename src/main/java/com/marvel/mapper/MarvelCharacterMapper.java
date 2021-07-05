package com.marvel.mapper;

import com.marvel.dto.MarvelCharacterDto;
import com.marvel.entity.MarvelCharacter;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = UrlMapper.class)
public interface MarvelCharacterMapper {
    MarvelCharacterDto toDto(MarvelCharacter marvelCharacter);
}

