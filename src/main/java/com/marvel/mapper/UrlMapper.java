package com.marvel.mapper;

import com.marvel.dto.UrlDto;
import com.marvel.entity.Url;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UrlMapper {

    UrlDto toDto(Url entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "character", ignore = true)
    Url toEntity(UrlDto dto);
}
