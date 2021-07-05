package com.marvel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class CharacterDataWrapper {

    @Id
    @GeneratedValue
    private Long id;

    private Integer code;

    private String status;

    private String copyright;

    private String attributionText;

    private String attributionHTML;

    @OneToOne(mappedBy = "wrapper")
    private CharacterDataContainer data;

    private String etag;
}

