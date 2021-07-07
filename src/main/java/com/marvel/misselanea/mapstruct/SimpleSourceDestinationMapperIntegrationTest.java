package com.marvel.misselanea.mapstruct;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

public class SimpleSourceDestinationMapperIntegrationTest {

    private final SimpleSourceDestinationMapper mapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Test
    public void givenSourceToDestination() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");

        SimpleDestination destination = mapper.sourceToDestination(simpleSource);

        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(), destination.getDescription());
    }

    @Test
    public void givenDestinationToSource() {
        SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");

        SimpleSource simpleSource = mapper.destinationToSource(destination);

        assertEquals(destination.getName(), simpleSource.getName());
        assertEquals(destination.getDescription(), simpleSource.getDescription());
    }
}
