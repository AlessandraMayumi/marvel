package com.marvel.mapper;

import com.marvel.dto.SeriesSummaryDto;
import com.marvel.entity.SeriesSummary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeriesSummaryMapper {
    SeriesSummaryDto toDto(SeriesSummary seriesSummary);
}

