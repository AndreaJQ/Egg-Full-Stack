package com.library.library.mapper;

import com.library.library.dto.AuthorDto;
import com.library.library.model.Author;

public class AuthorMapper {

    public static Author mapToAuthor(AuthorDto author){
        Author authorDto = Author.builder()
                .id(author.getId())
                .name(author.getName())
                .build();
        return authorDto;
    }

    public static AuthorDto mapToAuthorDto(Author author){
        AuthorDto authorDto = AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .build();
        return authorDto;
    }
}
