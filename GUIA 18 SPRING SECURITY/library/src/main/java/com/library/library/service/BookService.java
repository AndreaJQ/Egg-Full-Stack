package com.library.library.service;


import com.library.library.dto.AuthorDto;
import com.library.library.dto.BookDto;
import com.library.library.model.Author;
import com.library.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookDto> findAllBooks();

    Book saveBook (BookDto bookDto);

    BookDto findBookById (long bookId);

    void updateBook(BookDto book);

    void delete (Long bookId);

}
