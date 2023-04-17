package com.eggnews.eggnews.service;

import com.eggnews.eggnews.dto.CommentsDto;

import java.util.List;

public interface CommentsService {

    void createComment(Long newsId, CommentsDto commentsDto);

    List<CommentsDto> findAllComments();

    CommentsDto findByCommentsId(String commentId);

    void updateComment(CommentsDto commentsDto);

    void deleteComment(Long newsId, String commentsId);

}
