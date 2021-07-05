package com.marvel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterDataWrapperDto {
    private Integer code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private CharacterDataContainerDto data;
    private String etag;
}
