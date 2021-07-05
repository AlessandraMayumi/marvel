package com.marvel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
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

    @OneToOne(mappedBy = "wrapper", cascade = CascadeType.ALL)
    private CharacterDataContainer data;

    private String etag;
}

