package com.eggnews.eggnews.service;


import com.eggnews.eggnews.dto.NewsDto;
import com.eggnews.eggnews.models.News;

import javax.servlet.http.HttpSession;
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
    void saveNews(NewsDto newsDto, String userId);

    NewsDto findNewsById(Long newsId);

    void deleteNews(Long newsId);

    void updateNews(NewsDto news, String userId);

    List<NewsDto> searchNews(String query);
}
