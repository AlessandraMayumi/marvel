package com.marvel.mapper;

import com.marvel.dto.UrlDto;
import com.marvel.entity.Url;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UrlMapper {

    UrlDto toDto(Url url);
}

