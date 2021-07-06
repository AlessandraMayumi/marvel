package com.marvel.misselanea.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper()
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource source);

    @Mapping(target = "secret", ignore = true)
    SimpleSource destinationToSource(SimpleDestination destination);
}
