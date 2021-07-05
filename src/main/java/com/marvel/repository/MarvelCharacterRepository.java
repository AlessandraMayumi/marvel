package com.marvel.repository;

import com.marvel.entity.MarvelCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarvelCharacterRepository extends JpaRepository<MarvelCharacter, Long> {
}

