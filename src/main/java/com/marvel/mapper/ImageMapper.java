package com.marvel.mapper;

import com.marvel.dto.ImageDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.Image;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    ImageDto toDto(Image entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "character", ignore = true)
    Image toEntity(ImageDto dto);
}
