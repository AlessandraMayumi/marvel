package com.marvel.mapper;

import com.marvel.dto.ComicSummaryDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.ComicSummary;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComicSummaryMapper {

    ComicSummaryDto toDto(ComicSummary entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "comicList", ignore = true)
    ComicSummary toEntity(ComicSummaryDto dto);
}
