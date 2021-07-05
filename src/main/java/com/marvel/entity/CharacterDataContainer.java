package com.marvel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CharacterDataContainer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "data_offset")
    private Integer offset;

    @Column(name = "data_limit")
    private Integer limit;

    @Column(name = "data_total")
    private Integer total;

    @Column(name = "data_count")
    private Integer count;

    @OneToOne
    @JoinColumn(name = "character_data_wrapper_id")
    private CharacterDataWrapper wrapper;

    @OneToMany(mappedBy = "data", cascade = CascadeType.ALL)
    private List<MarvelCharacter> results;
}

