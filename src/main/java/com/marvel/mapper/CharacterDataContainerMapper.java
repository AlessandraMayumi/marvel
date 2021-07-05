package com.marvel.mapper;

import com.marvel.dto.CharacterDataContainerDto;
import com.marvel.entity.CharacterDataContainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = MarvelCharacterMapper.class)
public interface CharacterDataContainerMapper {
    CharacterDataContainerDto toDto(CharacterDataContainer container);
}

