package com.marvel.repository;

import com.marvel.entity.ComicList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicListRepository extends JpaRepository<ComicList, Long> {
}

