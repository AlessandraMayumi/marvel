package com.marvel.mapper;

import com.marvel.dto.SeriesListDto;
import com.marvel.entity.SeriesList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = SeriesSummaryMapper.class)
public interface SeriesListMapper {
    SeriesListDto toDto(SeriesList seriesList);
}

