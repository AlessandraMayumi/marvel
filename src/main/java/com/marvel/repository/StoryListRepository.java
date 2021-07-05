package com.marvel.repository;

import com.marvel.entity.StoryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryListRepository extends JpaRepository<StoryList, Long> {
}

