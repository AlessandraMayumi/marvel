package com.marvel.repository;

import com.marvel.entity.CharacterDataWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDataWrapperRepository extends JpaRepository<CharacterDataWrapper, Long> {
}

