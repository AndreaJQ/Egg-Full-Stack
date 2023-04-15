package com.library.library.service;

import com.library.library.dto.AuthorDto;
import com.library.library.model.Author;

import java.util.List;


public interface AuthorService {

List<AuthorDto> findAllAuthors();

Author saveAuthor (AuthorDto authorDto);

void deleteAuthor (String authorId);

void updateAuthor (AuthorDto author);

    AuthorDto findAuthorById(String authorId);
}
