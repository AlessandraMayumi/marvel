package com.marvel.mapper;

import com.marvel.dto.EventListDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.EventList;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = EventSummaryMapper.class)
public interface EventListMapper {

    EventListDto toDto(EventList entity);

    @Mapping(target = "character", ignore = true)
    EventList toEntity(EventListDto dto);
}
