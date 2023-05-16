package com.eggnews.eggnews.models;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table (name= "eggnews")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String imgUrl;
    private String subtitle;
    private String content;
    private String content2;
    private String content3;
    private String content4;

    @ManyToOne
    private UserEntity user;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @CreationTimestamp
    private LocalDateTime updatedOn;

    @OneToMany(mappedBy = "news", cascade = CascadeType.REMOVE)
    private List<Comments> comments=new ArrayList<>();
}
