package com.marvel.repository;

import com.marvel.entity.CharacterDataContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDataContainerRepository extends JpaRepository<CharacterDataContainer, Long> {
}

