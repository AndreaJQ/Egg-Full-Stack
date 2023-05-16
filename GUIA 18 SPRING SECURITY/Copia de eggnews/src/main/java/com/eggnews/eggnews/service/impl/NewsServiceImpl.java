package com.eggnews.eggnews.service.impl;

import com.eggnews.eggnews.dto.NewsDto;
import com.eggnews.eggnews.models.News;
import com.eggnews.eggnews.repository.NewsRepository;
import com.eggnews.eggnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.eggnews.eggnews.mapper.NewsMapper.mapToNews;
import static com.eggnews.eggnews.mapper.NewsMapper.mapToNewsDto;

@Service
public class NewsServiceImpl implements NewsService {

    private NewsRepository newsRepository;
    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    /* INDEX ----- LIST NEWS*/
    @Override
    public List<NewsDto> findAllNews(){
        List<News> news1 = newsRepository.findAll();
        return news1.stream().map(news -> mapToNewsDto(news)).collect(Collectors.toList());
        //map return a new list
    }

    @Override
    public News saveNews(NewsDto newsDto) {
        News news = mapToNews(newsDto);
        return newsRepository.save(news);
    }



    @Override
    public NewsDto findNewsById(Long newsId) {
        News news = newsRepository.findById(newsId).get();
        return mapToNewsDto(news);
    }

    @Override
    public void deleteNews(Long newsId) {
        newsRepository.deleteById(newsId);
    }

    @Override
    public void updateNews(NewsDto newsDto) {
        News news = mapToNews(newsDto);
        newsRepository.save(news);
    }

    @Override
    public List<NewsDto> searchNews(String query) {
        List<News>news1=newsRepository.searchNews(query);
        return news1.stream().map(news -> mapToNewsDto(news)).collect(Collectors.toList());
    }







}
