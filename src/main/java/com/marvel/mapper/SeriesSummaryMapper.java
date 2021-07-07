package com.marvel.mapper;

import com.marvel.dto.SeriesSummaryDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.SeriesSummary;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeriesSummaryMapper {

    SeriesSummaryDto toDto(SeriesSummary entity);

    @Mapping(target = "seriesList", ignore = true)
    @Mapping(target = "id", ignore = true)
    SeriesSummary toEntity(SeriesSummaryDto dto);
}
