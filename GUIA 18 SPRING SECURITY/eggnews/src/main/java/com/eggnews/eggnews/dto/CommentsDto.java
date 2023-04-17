package com.eggnews.eggnews.dto;

import com.eggnews.eggnews.models.News;
import com.eggnews.eggnews.models.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentsDto {


    private String id;
    private String content;
    private UserEntity user;
    private LocalDateTime createdOn;
    private News news;

}
