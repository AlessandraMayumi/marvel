package com.marvel.mapper;

import com.marvel.dto.ImageDto;
import com.marvel.entity.Image;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {
    ImageDto toDto(Image image);
}

