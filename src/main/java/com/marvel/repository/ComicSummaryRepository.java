package com.marvel.repository;

import com.marvel.entity.ComicSummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicSummaryRepository extends JpaRepository<ComicSummary, Long> {
}

