package com.marvel.specification;

import com.marvel.entity.MarvelCharacter;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

public class MarvelCharacterSpecification{

    public static Specification<MarvelCharacter> criteria(final MarvelCharacterFilter filter) {
        if(Objects.nonNull(filter)) {
            return (root, query, builder) -> {
//                final Predicate name = builder.like(root.get("name"), filter.getName());
//                final Predicate comics = builder.like(root.get("comics"), filter.getComics());
//                final Predicate stories = builder.like(root.get("stories"), filter.getStories());
//                final Predicate events = builder.like(root.get("events"), filter.getEvents());
//                final Predicate series = builder.like(root.get("series"), filter.getSeries());
//                return builder.or(name, comics, stories, events, series);
                return builder.like(root.get("name"), filter.getName());
            };
        }
        return null;
    }
}
