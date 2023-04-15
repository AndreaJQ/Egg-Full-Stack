package com.eggnews.eggnews.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/*DTO DATA TRANSFER OBJECT
* when you return data back or you push data to the API you don't want all the values available
* all that a dto is is a model with or without the values where you can submit or return data in a secure fashion.
*
* the DTO layer is where you should define your validation logic
* https://auth0.com/blog/how-to-automatically-map-jpa-entities-into-dtos-in-spring-boot-using-mapstruct/
* */

    @Data
    @Builder
    public class NewsDto {

        private Long id;
        @NotEmpty(message = "New title should not be empty")
        private String title;
        @NotEmpty(message = "Author should not be empty")
        private String author;
        @NotEmpty(message = "PhotoUrl should not be empty")
        private String imgUrl;
        @NotEmpty(message = "Subtitle should not be empty")
        private String subtitle;
        @NotEmpty(message = "Content should not be empty")
        private String content;

        private String content2;

        private String content3;

        private String content4;

        private LocalDateTime createdOn;

        private LocalDateTime updatedOn;


}
