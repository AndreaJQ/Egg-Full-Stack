package com.library.library.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;


@Data
@Builder
public class AuthorDto {

    private String id;
    @NotEmpty(message = "The name of the author should not be empty")
    private String name;
}
