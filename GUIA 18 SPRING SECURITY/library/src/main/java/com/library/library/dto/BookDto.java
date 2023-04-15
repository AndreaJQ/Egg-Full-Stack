package com.library.library.dto;

import com.library.library.model.Author;
import com.library.library.model.Editorial;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Builder
public class BookDto {

    private Long id;
    @NotEmpty(message = "Title should not be empty")
    private String title;

    private Integer samples;

    private Date createdOn;

    @ManyToOne

    private Author author;

    @ManyToOne
    private Editorial editorial;
}
