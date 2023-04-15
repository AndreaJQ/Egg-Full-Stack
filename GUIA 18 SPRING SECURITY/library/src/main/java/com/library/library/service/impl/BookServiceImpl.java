package com.library.library.service.impl;

import com.library.library.dto.BookDto;
import com.library.library.model.Book;
import com.library.library.repository.BookRepository;
import com.library.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.library.library.mapper.BookMapper.mapToBook;
import static com.library.library.mapper.BookMapper.mapToBookDto;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //---------------------------READ-----------------------------
    @Override
    public List<BookDto> findAllBooks() {
        List<Book> books=bookRepository.findAll();
        return books.stream().map(book -> mapToBookDto(book)).collect(Collectors.toList());
    }



    //---------------------------CREATE---------------------------
    @Override

    public Book saveBook(BookDto bookDto) {
        Book book = mapToBook(bookDto);
        return bookRepository.save(book);
    }

    @Override

    public BookDto findBookById(long bookId) {
        Book book = bookRepository.findById(bookId).get();
        return mapToBookDto(book);
    }

    //---------------------------UPDATE------------------------------
    @Override

    public void updateBook(BookDto bookDto) {
        Book book = mapToBook(bookDto);
        bookRepository.save(book);

    }

    //------------------------DELETE----------------------------
    @Override
    public void delete(Long bookId) {
        bookRepository.deleteById(bookId);

    }


}
