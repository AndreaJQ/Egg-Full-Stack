package com.eggnews.eggnews.mapper;

import com.eggnews.eggnews.dto.CommentsDto;
import com.eggnews.eggnews.models.Comments;

public class CommentsMapper {
    public static Comments mapToComments(CommentsDto commentsDto){
        return Comments.builder()
                .id(commentsDto.getId())
                .content(commentsDto.getContent())
                .createdOn(commentsDto.getCreatedOn())
                .news(commentsDto.getNews())
                .build();
    }


    public static CommentsDto mapToCommentsDto(Comments comments){
        return CommentsDto.builder()
                .id(comments.getId())
                .content(comments.getContent())
                .createdOn(comments.getCreatedOn())
                .news(comments.getNews())
                .build();
    }

}
