package com.marvel.mapper;

import com.marvel.dto.EventSummaryDto;
import com.marvel.entity.EventSummary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventSummaryMapper {
    EventSummaryDto toDto(EventSummary eventSummary);
}

