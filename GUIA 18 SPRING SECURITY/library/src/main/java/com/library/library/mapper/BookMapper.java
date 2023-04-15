package com.library.library.mapper;

import com.library.library.dto.BookDto;
import com.library.library.model.Book;

public class BookMapper {



    public static Book mapToBook(BookDto book){
        Book bookDto = Book.builder()
                .id(book.getId())
                .title(book.getTitle())
                .samples(book.getSamples())
                .createdOn(book.getCreatedOn())
                .author(book.getAuthor())
                .editorial(book.getEditorial())
                .build();
        return bookDto;
    }

    public static BookDto mapToBookDto(Book book){
        BookDto bookDto = BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .samples(book.getSamples())
                .createdOn(book.getCreatedOn())
                .author(book.getAuthor())
                .editorial(book.getEditorial())
                .build();
        return bookDto;
    }
}
