package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.dto.CommentsDto;
import com.eggnews.eggnews.models.Comments;
import com.eggnews.eggnews.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CommentsController {

    private CommentsService commentsService;

    @Autowired
    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @GetMapping("/comments")
    public String commentsList (Model model){
        List<CommentsDto> comments = commentsService.findAllComments();
        model.addAttribute("comments", comments);
        return "comments-list";
    }


    @GetMapping("/comments/{commentsId}")
    public String viewComments(@PathVariable("commentsId") String commentId, Model model){
        CommentsDto commentsDto = commentsService.findByCommentsId(commentId);
        model.addAttribute("comments", commentsDto);
        return "comments-detail";
    }

    @GetMapping("/comments/{newsId}/new")
    public String addCommentForm(@PathVariable("newsId") Long newsId, Model model){
        Comments comments = new Comments();
        model.addAttribute("newsId", newsId);
        model.addAttribute("comments", comments);
        return "comments-create";
    }

    @PostMapping("/comments/{newsId}")
    public String comment(@PathVariable("newsId")Long newsId,
                          @ModelAttribute("comments") CommentsDto commentsDto, Model model){

        commentsService.createComment(newsId,commentsDto);
        return "redirect:/news/" + newsId;
    }



    @GetMapping("/comments/delete/{commentsId}")
    public String deleteComment(@PathVariable("commentsId") String commentsId,@RequestParam (value = "newsId", required = false) Long newsId){
        commentsService.deleteComment(newsId, commentsId);
        return  "redirect:/comments";

        //NEED TO SOLVE THE REQUESTPARAM SO THAT AFTER DELETING A COMMENT GOES BACK TO THE NEWS DETAILS
    }



}
