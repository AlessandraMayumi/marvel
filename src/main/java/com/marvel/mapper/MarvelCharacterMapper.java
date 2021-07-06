package com.marvel.mapper;

import com.marvel.dto.MarvelCharacterDto;
import com.marvel.entity.MarvelCharacter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = UrlMapper.class)
public interface MarvelCharacterMapper {

    MarvelCharacterDto toDto(MarvelCharacter entity);

    @Mapping(target = "id", ignore = true)
    MarvelCharacter toEntity(MarvelCharacterDto dto);
}
