package com.marvel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class StorySummary {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceURI;

    private String name;

    private String type;

    @ManyToOne
    @JoinColumn(name = "story_list_id")
    private StoryList storyList;
}

