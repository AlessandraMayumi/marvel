package com.marvel.mapper;

import com.marvel.dto.StorySummaryDto;
import com.marvel.dto.UrlDto;
import com.marvel.entity.StorySummary;
import com.marvel.entity.Url;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StorySummaryMapper {

    StorySummaryDto toDto(StorySummary entity);

    @Mapping(target = "storyList", ignore = true)
    @Mapping(target = "id", ignore = true)
    StorySummary toEntity(StorySummaryDto dto);
}
