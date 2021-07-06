package com.marvel.mapper;

import com.marvel.dto.SeriesListDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.SeriesList;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = SeriesSummaryMapper.class)
public interface SeriesListMapper {

    SeriesListDto toDto(SeriesList entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "character", ignore = true)
    SeriesList toEntity(SeriesListDto dto);
}
