package com.eggnews.eggnews.service.impl;

import com.eggnews.eggnews.dto.CommentsDto;
import com.eggnews.eggnews.models.Comments;
import com.eggnews.eggnews.models.News;
import com.eggnews.eggnews.models.UserEntity;
import com.eggnews.eggnews.repository.CommentsRepository;
import com.eggnews.eggnews.repository.NewsRepository;
import com.eggnews.eggnews.repository.UserRepository;
import com.eggnews.eggnews.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.eggnews.eggnews.mapper.CommentsMapper.mapToComments;
import static com.eggnews.eggnews.mapper.CommentsMapper.mapToCommentsDto;

@Service
public class CommentsServiceImpl implements CommentsService {

    private NewsRepository newsRepository;
    private CommentsRepository commentsRepository;
    private UserRepository userRepository;

    @Autowired
    public CommentsServiceImpl(NewsRepository newsRepository, CommentsRepository commentsRepository, UserRepository userRepository) {
        this.newsRepository = newsRepository;
        this.commentsRepository = commentsRepository;
        this.userRepository=userRepository;
    }



    @Override
    public void createComment(Long newsId, CommentsDto commentsDto, String userId) {
        News news = newsRepository.findById(newsId).get();
        Comments comments=mapToComments(commentsDto);
        UserEntity user = new UserEntity();
        Optional<UserEntity> answer = userRepository.findById(userId);
        if (answer.isPresent()){
            user=answer.get();
            comments.setUser(user);
            comments.setNews(news);
            commentsRepository.save(comments);
        }
    }

    @Override
    public List<CommentsDto> findAllComments() {
        List<Comments> comment = commentsRepository.findAll();
        return comment.stream().map(comments -> mapToCommentsDto(comments)).collect(Collectors.toList());
    }

    @Override
    public CommentsDto findByCommentsId(String commentId) {
        Comments comments = commentsRepository.findById(commentId).get();
        return mapToCommentsDto(comments);
    }

    @Override
    public void updateComment(CommentsDto commentsDto) {
    Comments comments = mapToComments(commentsDto);
    commentsRepository.save(comments);
    }

    @Override
    public void deleteComment(Long newsId, String commentId) {

    commentsRepository.deleteById(commentId);
    }
}
