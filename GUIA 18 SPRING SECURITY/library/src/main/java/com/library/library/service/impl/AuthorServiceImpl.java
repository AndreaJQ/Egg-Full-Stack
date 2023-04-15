package com.library.library.service.impl;

import com.library.library.dto.AuthorDto;
import com.library.library.model.Author;
import com.library.library.repository.AuthorRepository;
import com.library.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static com.library.library.mapper.AuthorMapper.mapToAuthor;
import static com.library.library.mapper.AuthorMapper.mapToAuthorDto;

@Service
public class AuthorServiceImpl implements AuthorService {


    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDto> findAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        return authors.stream().map(author -> mapToAuthorDto(author)).collect(Collectors.toList());
    }

    @Override
    public Author saveAuthor(AuthorDto authorDto) {
        Author author = mapToAuthor(authorDto);
        return authorRepository.save(author);
    }



    @Override
    public void deleteAuthor(String authorId) {
    authorRepository.deleteById(authorId);

    }

    @Override
    public void updateAuthor(AuthorDto authorDto) {
        Author author = mapToAuthor(authorDto);
        authorRepository.save(author);

    }

    @Override
    public AuthorDto findAuthorById(String authorId) {
        Author author = authorRepository.findById(authorId).get();
        return mapToAuthorDto(author);
    }


}
