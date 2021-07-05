package com.marvel.mapper;

import com.marvel.dto.ComicListDto;
import com.marvel.entity.ComicList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ComicSummaryMapper.class)
public interface ComicListMapper {
    ComicListDto toDto(ComicList comicList);
}

