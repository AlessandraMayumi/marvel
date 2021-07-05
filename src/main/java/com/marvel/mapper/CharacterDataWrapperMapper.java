package com.marvel.mapper;

import com.marvel.dto.CharacterDataWrapperDto;
import com.marvel.entity.CharacterDataWrapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = CharacterDataContainerMapper.class)
public interface CharacterDataWrapperMapper {
//    List<CharacterDataWrapperDto> toDto(List<CharacterDataWrapper> wrappers);
    CharacterDataWrapperDto toDto(CharacterDataWrapper wrapper);
}

