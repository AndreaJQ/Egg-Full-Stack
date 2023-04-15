package com.eggnews.eggnews.service;


import com.eggnews.eggnews.dto.NewsDto;
import com.eggnews.eggnews.models.News;

import java.util.List;

/*in the Repository you have CRUD methods
but we have services as LAYERS OF ABSTRACTIONS
within a service you use various repository method.

interface makes it easier
but the interface must be implemented.


all of the repository methods will be used in the service for abstraction
* */
public interface NewsService {

    List<NewsDto> findAllNews();
    News saveNews(NewsDto newsDto);

    NewsDto findNewsById(long newsId);

    void deleteNews(long newsId);

    void updateNews(NewsDto news);

    List<NewsDto> searchNews(String query);
}
