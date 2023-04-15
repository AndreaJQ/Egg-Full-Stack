package com.library.library.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="book")
public class Book {

    @Id
    private Long id;
    private String title;
    private Integer samples;

    @Temporal(TemporalType.DATE)
    private Date createdOn;

    @ManyToOne
    @JoinColumn(name="author_Id")
    private Author author;

    @ManyToOne
    @JoinColumn(name="editorial_Id")
    private Editorial editorial;
}
