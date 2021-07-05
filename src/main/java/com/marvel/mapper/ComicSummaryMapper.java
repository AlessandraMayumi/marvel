package com.marvel.mapper;

import com.marvel.dto.ComicSummaryDto;
import com.marvel.entity.ComicSummary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComicSummaryMapper {
    ComicSummaryDto toDto(ComicSummary comicSummary);
}

