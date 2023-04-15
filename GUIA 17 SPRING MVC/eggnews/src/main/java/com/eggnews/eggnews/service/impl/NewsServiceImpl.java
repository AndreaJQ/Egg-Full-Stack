package com.eggnews.eggnews.service.impl;

import com.eggnews.eggnews.dto.NewsDto;
import com.eggnews.eggnews.models.News;
import com.eggnews.eggnews.repository.NewsRepository;
import com.eggnews.eggnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public NewsDto findNewsById(long newsId) {
        News news = newsRepository.findById(newsId).get();
        return mapToNewsDto(news);
    }

    @Override
    public void deleteNews(long newsId) {
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


    private News mapToNews(NewsDto news) {
        News newsDto = News.builder()
                .id(news.getId())
                .title(news.getTitle())
                .author(news.getAuthor())
                .imgUrl(news.getImgUrl())
                .subtitle(news.getSubtitle())
                .content(news.getContent())
                .content2(news.getContent2())
                .content3(news.getContent3())
                .content4(news.getContent4())
                .createdOn(news.getCreatedOn())
                .updatedOn(news.getUpdatedOn())
                .build();
        return newsDto;
    }

    //
    private NewsDto mapToNewsDto(News news) {
        NewsDto newsDto = NewsDto.builder()
                .id(news.getId())
                .title(news.getTitle())
                .author(news.getAuthor())
                .imgUrl(news.getImgUrl())
                .subtitle(news.getSubtitle())
                .content(news.getContent())
                .content2(news.getContent2())
                .content3(news.getContent3())
                .content4(news.getContent4())
                .createdOn(news.getCreatedOn())
                .updatedOn(news.getUpdatedOn())
                .build();
        return newsDto;
    }




}
