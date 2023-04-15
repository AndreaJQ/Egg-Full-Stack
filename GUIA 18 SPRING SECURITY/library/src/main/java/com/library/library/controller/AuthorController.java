package com.library.library.controller;

import com.library.library.dto.AuthorDto;
import com.library.library.model.Author;
import com.library.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    //-------------------------READ -----------------------------
    @GetMapping("/author/list")
    public String listAuthor(Model model){
        List<AuthorDto> authors = authorService.findAllAuthors();
        model.addAttribute("authors",authors);
        return "authors-list";
    }
    //---------------------CREATE AUTHOR--------------------------
    @GetMapping ("/author/register")
    public String registerAuthor(Model model){
        Author author = new Author();
        model.addAttribute("author", author);
        return "author-form";
    }

    @PostMapping("/author/register")
    public String saveAuthor(@Valid @ModelAttribute("author") AuthorDto authorDto,
                              BindingResult result,
                              Model model){
        if (result.hasErrors()){
            model.addAttribute("author",authorDto);
            return "author-form";
        }
        authorService.saveAuthor(authorDto);
        return "redirect:/author/list";
    }



    //------------------UPDATE - EDIT  AUTHOR ------------------------
    @GetMapping("/author/edit/{authorId}")
    public String editAuthorForm (@PathVariable("authorId") String authorId,Model model){
    AuthorDto author = authorService.findAuthorById(authorId);
    model.addAttribute("author", author);
            return "author-edit";
    }

    @PostMapping("/author/edit/{authorId}")
    public String updateAuthor(@PathVariable ("authorId") String authorId,
                               @Valid @ModelAttribute("author") AuthorDto author,
                               BindingResult result){
        if (result.hasErrors()){
            return "author-edit";
        }
        author.setId(authorId);
        authorService.updateAuthor(author);
        return "redirect:/author/list";
    }


    //----------------------------DELETE AUTHOR-------------------------
    @GetMapping("/author/list/{authorId}")
    public String deleteAuthor(@PathVariable("authorId") String authorId){
        authorService.deleteAuthor(authorId);
        return "redirect:/author/list";
    }


}
