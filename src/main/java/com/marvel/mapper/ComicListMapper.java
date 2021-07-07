package com.marvel.mapper;

import com.marvel.dto.ComicListDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.ComicList;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = ComicSummaryMapper.class)
public interface ComicListMapper {

    ComicListDto toDto(ComicList entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "character", ignore = true)
    ComicList toEntity(ComicListDto dto);
}
