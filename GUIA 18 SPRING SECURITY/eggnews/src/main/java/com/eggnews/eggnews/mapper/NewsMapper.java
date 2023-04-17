package com.eggnews.eggnews.mapper;

import com.eggnews.eggnews.dto.NewsDto;
import com.eggnews.eggnews.models.News;

public class NewsMapper {

    public static News mapToNews(NewsDto news) {
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
                .user(news.getUser())
                .createdOn(news.getCreatedOn())
                .updatedOn(news.getUpdatedOn())
                .comments(news.getComments())
                .build();
        return newsDto;
    }

    //
    public static NewsDto mapToNewsDto(News news) {
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
                .user(news.getUser())
                .createdOn(news.getCreatedOn())
                .updatedOn(news.getUpdatedOn())
                .comments(news.getComments())
                .build();
        return newsDto;
    }

}
