package com.marvel.repository;

import com.marvel.entity.StorySummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorySummaryRepository extends JpaRepository<StorySummary, Long> {
}

