package com.marvel.mapper;

import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StorySummaryMapper {
    StorySummaryDto toDto(StorySummary storySummary);
}

