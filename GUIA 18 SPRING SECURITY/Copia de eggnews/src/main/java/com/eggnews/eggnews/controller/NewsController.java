package com.eggnews.eggnews.controller;
/*
Controllers control our URL endpoints
and what http method we can receive
GET
POST
think ahead what method you need.
*/


import com.eggnews.eggnews.dto.NewsDto;
import com.eggnews.eggnews.models.News;
import com.eggnews.eggnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.List;

@Controller
public class NewsController {

    private NewsService newsService;
    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    //---------------------------READ-----------------------LIST
    //GET MAPPING
    @GetMapping("/news")
    public String listNews(Model model){
        List<NewsDto> news = newsService.findAllNews();
        model.addAttribute("news", news);
        return "news-list";
    }


    // -------------------CREATE------------------------

    //---------------------------READ-----------------------
    //A GET MAPPING IS NEEDED BEFORE POST MAPPING A NEW OBJECT
    @GetMapping("/news/brandnew")
    public String createNewsForm(Model model){
        News news = new News();
        model.addAttribute("news",news);
        return "news-create";
    }
    // -----------------CREATE      NEWS-----------------
    @PostMapping("/news/brandnew")
    public String saveNews(@Valid @ModelAttribute("news")NewsDto newsDto,
                        BindingResult result,
                           Model model){

        if (result.hasErrors()){
            model.addAttribute("news", newsDto);
            return "news-create";
        }
        newsService.saveNews(newsDto);
        return "redirect:/news";
    }

    //----------------------READ-----------------------DETAIL
    @GetMapping("/news/{newsId}")
    public String newsDetail(@PathVariable("newsId") long newsId, Model model){
        NewsDto newsDto = newsService.findNewsById(newsId);
        model.addAttribute("news", newsDto);
        return "news-details";
    }
    //-------------------UPDATE------------------------
    //must make a getmapping before Postmapping the update
    @GetMapping("/news/{newsId}/edit")
    public String editnewsForm(@PathVariable("newsId") long newsId, Model model){
        NewsDto news = newsService.findNewsById(newsId);
        model.addAttribute("news", news);
        return "news-edit";
    }

    // ----------------- UPDATE          NEWS-----------------
    @PostMapping("/news/{newsId}/edit")
    public String updateNews(@PathVariable("newsId") long newsId,
                             @Valid @ModelAttribute("news")NewsDto news,
                                BindingResult result) {

        if (result.hasErrors()) {
            return "news-edit";
        }
        news.setId(newsId);
        newsService.updateNews(news);
        return "redirect:/news";
    }

    //-------------------DELETE------------------------
    @GetMapping("/news/{newsId}/delete")
    public String deletenews(@PathVariable("newsId") long newsId){
        newsService.deleteNews(newsId);
        return "redirect:/news";
    }


    //---------------------------READ-----------------------SEARCH
    @GetMapping("/news/search")
    public String searchClub(@RequestParam(value="query") String query, Model model){
        List<NewsDto> news = newsService.searchNews(query);
        model.addAttribute("news", news);
        return "news-list" ;
    }

}
