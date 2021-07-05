package com.marvel.repository;

import com.marvel.entity.EventList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventListRepository extends JpaRepository<EventList, Long> {
}

