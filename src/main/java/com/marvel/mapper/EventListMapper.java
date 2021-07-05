package com.marvel.mapper;

import com.marvel.dto.EventListDto;
import com.marvel.entity.EventList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = EventSummaryMapper.class)
public interface EventListMapper {
    EventListDto toDto(EventList eventList);
}

