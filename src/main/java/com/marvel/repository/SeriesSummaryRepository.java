package com.marvel.repository;

import com.marvel.entity.SeriesSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesSummaryRepository extends JpaRepository<SeriesSummary, Long> {
}

