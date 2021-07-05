package com.marvel.mapper;

import com.marvel.dto.StoryListDto;
import com.marvel.entity.StoryList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = StorySummaryMapper.class)
public interface StoryListMapper {
    StoryListDto toDto(StoryList storyList);
}

