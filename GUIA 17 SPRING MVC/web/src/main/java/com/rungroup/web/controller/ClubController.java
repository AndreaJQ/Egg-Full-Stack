package com.rungroup.web.controller;


/*
Controllers control our URL endpoints
and what http method we can receive
GET
POST
think ahead what method you need.
*/

import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.models.Club;
import com.rungroup.web.models.UserEntity;
import com.rungroup.web.security.SecurityUtil;
import com.rungroup.web.service.ClubService;
import com.rungroup.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ClubController {


    private ClubService clubService;
    private UserService userService;
    @Autowired
    public ClubController(ClubService clubService, UserService userService) {
        this.clubService = clubService;
        this.userService = userService;
    }



    //----------CLUB LIST-------------------
    @GetMapping("/clubs")
    public String listClubs(Model model, HttpSession session) {
        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();

        UserEntity logged = (UserEntity) session.getAttribute("usersession");

        if(logged != null) {
            user = userService.findByUsername(logged.getId().toString());
            model.addAttribute("user", user);
        }
        model.addAttribute("user", user);
        model.addAttribute("clubs", clubs);
        return "clubs-list";
    }

      /*model is going to allow us  to put stuf on the webpage
        the actual data is on our code. How do we get the data? -> the model does it

        (attibuteName "clubs", clubs)
        the model will be used to inyect the data into the webpage
        */


    /*Make a get request in order to be able to display the form*/
    //----------CLUB DETAILS-------------------
@GetMapping("/clubs/{clubId}")
    public String clubDetail(@PathVariable("clubId") long clubId, Model model){
    ClubDto clubDto= clubService.findClubById(clubId);
    model.addAttribute("club", clubDto);
    return "clubs-details";
}

    //----------CLUB CREATE FORM-------------------
    @GetMapping("/clubs/new")
    public String createClubForm(Model model){
        Club club = new Club();
        model.addAttribute("club",club);
        return "clubs-create";
    }

    @GetMapping ("clubs/{clubId}/delete")
    public String deleteClub(@PathVariable("clubId") Long clubId){
        clubService.detele(clubId);
        return "redirect:/clubs";
    }

    @GetMapping("/clubs/search")
    public String searchClub(@RequestParam(value="query") String query, Model model){
    List<ClubDto> clubs = clubService.searchClubs(query);
    model.addAttribute("clubs", clubs);
    return "clubs-list" ;
    }


    /* a post request will be able to send the data to the server*/

    //----------CLUB SAVE-------------------
    @PostMapping("/clubs/new")
        public String saveClub(@Valid @ModelAttribute("club")ClubDto clubDto,
                                BindingResult result,
                               Model model){
        if (result.hasErrors()){
            model.addAttribute("club",clubDto);
            return "clubs-create";
        }
        //here goes the method from the ClubService which is an interface and the methods are being implemented
        // in the Class ClubServiceImpl. which in time implements the automatic methods from ClubRepository SAVE
        clubService.saveClub(clubDto);
        return "redirect:/clubs";
        }

    //----------CLUB EDIT-------------------
    @GetMapping("/clubs/{clubId}/edit")
    public String editClubForm(@PathVariable("clubId") long clubId, Model model){
    ClubDto club = clubService.findClubById(clubId);
    model.addAttribute("club", club);
    return "clubs-edit";
    }


    //----------CLUB UPDATE-------------------
    @PostMapping("/clubs/{clubId}/edit")
    public String updateClub(@PathVariable("clubId")long clubId,
                             @Valid @ModelAttribute("club") ClubDto club,
                            BindingResult result){
        if (result.hasErrors()){
            return "clubs-edit";
        }
        club.setId(clubId);
        clubService.updateClub(club);
        return "redirect:/clubs";
    }
}
