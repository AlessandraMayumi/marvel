package com.marvel.mapper;

import com.marvel.dto.StoryListDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.StoryList;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = StorySummaryMapper.class)
public interface StoryListMapper {

    StoryListDto toDto(StoryList entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "character", ignore = true)
    StoryList toEntity(StoryListDto dto);
}
