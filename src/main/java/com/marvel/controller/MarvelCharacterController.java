package com.marvel.controller;

import com.marvel.dto.MarvelCharacterDto;
import com.marvel.entity.MarvelCharacter;
import com.marvel.mapper.MarvelCharacterMapper;
import com.marvel.repository.MarvelCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/v1/public/character")
public class MarvelCharacterController {

    @Autowired
    private MarvelCharacterRepository repository;

    @Autowired
    private MarvelCharacterMapper mapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<MarvelCharacterDto> getAll(final Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }
}

