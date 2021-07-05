package com.marvel.repository;

import com.marvel.entity.EventSummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventSummaryRepository extends JpaRepository<EventSummary, Long> {
}

