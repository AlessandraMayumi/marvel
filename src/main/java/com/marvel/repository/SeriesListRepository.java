package com.marvel.repository;

import com.marvel.entity.SeriesList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesListRepository extends JpaRepository<SeriesList, Long> {
}

