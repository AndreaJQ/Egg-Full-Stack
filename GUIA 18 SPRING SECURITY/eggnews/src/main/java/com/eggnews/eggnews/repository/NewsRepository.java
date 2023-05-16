package com.eggnews.eggnews.repository;

import com.eggnews.eggnews.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

//each repository must have its own entity.
//only has crud methods
//perform crud actions
//turn db tables into objects so they can travel throw the services and display into the webpage
public interface NewsRepository extends JpaRepository <News, Long> {


    //QUERY FOR SEARCHING
    Optional<News> findByTitle(String url);
    @Query ("SELECT n FROM News n WHERE n.title LIKE CONCAT('%',:query,'%')")
    List<News> searchNews(String query);


}
