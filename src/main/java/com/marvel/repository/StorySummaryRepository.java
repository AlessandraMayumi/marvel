package com.marvel.repository;

import com.marvel.entity.StorySummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorySummaryRepository extends JpaRepository<StorySummary, Long> {
}

