package com.marvel.mapper;

import com.marvel.dto.EventSummaryDto;
import com.marvel.dto.StorySummaryDto;
import com.marvel.entity.EventSummary;
import com.marvel.entity.StorySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventSummaryMapper {

    EventSummaryDto toDto(EventSummary entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "eventList", ignore = true)
    EventSummary toEntity(EventSummaryDto dto);
}
