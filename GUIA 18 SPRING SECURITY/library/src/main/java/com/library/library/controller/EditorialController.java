package com.library.library.controller;

import com.library.library.dto.AuthorDto;
import com.library.library.dto.EditorialDto;
import com.library.library.model.Editorial;
import com.library.library.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EditorialController {

    private EditorialService editorialService;
    @Autowired
    public EditorialController(EditorialService editorialService) {
        this.editorialService = editorialService;
    }

    //-------------------------READ -----------------------------
    @GetMapping("/editorial/list")
    public String listEditorials(Model model) {
        List<EditorialDto> editorials= editorialService.findAllEditorials();
        model.addAttribute("editorials", editorials);

        return "editorial-list";
    }
    //----------------- CREATE EDITORIAL------------------------
    @GetMapping("/editorial/register")
    public String registerEditorial(Model model){
        Editorial editorial = new Editorial();
        model.addAttribute("editorial", editorial);
        return "editorial-form";
    }

    @PostMapping("/editorial/register")
    public String saveEditorial(@Valid @ModelAttribute("editorial") EditorialDto editorialDto,
                                BindingResult result,
                                Model model){

        if (result.hasErrors()){
            model.addAttribute("editorial", editorialDto);
            return "editorial-form";
        }
        editorialService.saveEditorial(editorialDto);
        return "redirect:/editorial/list";
    }

    //------------------UPDATE EDIT  EDITORIAL------------------------

    @GetMapping("/editorial/edit/{editorialId}")
    public String editEditorialForm (@PathVariable("editorialId") String editorialId,Model model){
        EditorialDto editorial = editorialService.findEditorialById(editorialId);
        model.addAttribute("editorial", editorial);
        return "editorial-edit";
    }

    @PostMapping("/editorial/edit/{editorialId}")
    public String updateEditorial(@PathVariable ("editorialId") String editorialId,
                               @Valid @ModelAttribute("editorial") EditorialDto editorial,
                               BindingResult result){
        if (result.hasErrors()){
            return "editorial-edit";
        }
        editorial.setId(editorialId);
        editorialService.updateEditorial(editorial);
        return "redirect:/editorial/list";
    }

    //-------------------------DELETE------------------------------
    @GetMapping("/editorial/delete/{editorialId}")
    public String deleteEditorial(@PathVariable("editorialId") String editorialId){
        editorialService.deleteEditorial(editorialId);
        return "redirect:/editorial/list";
    }
}
