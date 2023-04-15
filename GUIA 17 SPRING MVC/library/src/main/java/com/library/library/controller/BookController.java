package com.library.library.controller;

import com.library.library.dto.AuthorDto;
import com.library.library.dto.BookDto;
import com.library.library.dto.EditorialDto;
import com.library.library.model.Author;
import com.library.library.model.Book;
import com.library.library.service.AuthorService;
import com.library.library.service.BookService;
import com.library.library.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BookController {

    private BookService bookService;
    private AuthorService authorService;
    private EditorialService editorialService;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService, EditorialService editorialService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.editorialService = editorialService;
    }






    //-------------------------READ -----------------------------
    @GetMapping("/book/list")
    public String listBooks(Model model){
        List<BookDto> book = bookService.findAllBooks();
        model.addAttribute("book",book);
            return "book-list";
    }
   //-------------------------CREATE -----------------------------
    @GetMapping("/book/register")
    public String registerBook(Model model){
        Book book = new Book();
        List<AuthorDto> author=authorService.findAllAuthors();
        List<EditorialDto> editorial= editorialService.findAllEditorials();
        model.addAttribute("author", author);
        model.addAttribute("editorial", editorial);
        model.addAttribute("book", book);
        return "book-form";
    }
    @PostMapping("/book/register")
    public String saveBook(@Valid @ModelAttribute ("book") BookDto bookDto,
                           BindingResult result,
                           Model model){
        if (result.hasErrors()){
            model.addAttribute("book", bookDto);
            List<AuthorDto> author=authorService.findAllAuthors();
            List<EditorialDto> editorial= editorialService.findAllEditorials();
            model.addAttribute("author", author);
            model.addAttribute("editorial", editorial);
            return "book-form";
        }
        bookService.saveBook(bookDto);
        return "redirect:/book/list";
    }



    //-------------------------EDIT 2 ----------------------------
    @GetMapping("/book/edit/{bookId}")
    public String editBook(@PathVariable("bookId") Long bookId, ModelMap model){
        BookDto book = bookService.findBookById(bookId);
        List<AuthorDto> author=authorService.findAllAuthors();
        List<EditorialDto> editorial= editorialService.findAllEditorials();
        model.addAttribute("author", author);
        model.addAttribute("editorial", editorial);
        model.addAttribute("book", book);
        return "book-edit";
    }
    @PostMapping("/book/edit/{bookId}")
    public String editBook(@Valid @PathVariable ("bookId") Long bookId, @ModelAttribute ("book") BookDto bookDto,
                           BindingResult result,
                           Model model){

        if (result.hasErrors()){
            model.addAttribute("book", bookDto);
            List<AuthorDto> author=authorService.findAllAuthors();
            List<EditorialDto> editorial= editorialService.findAllEditorials();
            model.addAttribute("author", author);
            model.addAttribute("editorial", editorial);
            return "book-edit";
        }
        bookDto.setId(bookId);
        bookService.saveBook(bookDto);
        return "redirect:/book/list";
    }

    //-------------------------DELETE -----------------------------

    @GetMapping("/book/delete/{bookId}")
    public String deleteBook(@PathVariable("bookId") Long bookId){
        bookService.delete(bookId);
        return "redirect:/book/list";
    }





    //-------------------------READ - SEARCH -----------------------------
}
