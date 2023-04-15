package com.rungroup.web.dto;

import com.rungroup.web.models.UserEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;

/*DTO
if you don't want all the information shown
Return specific field/information.
Provide Security. Encapsulates the data

This is not hooked to a db
*/

@Data
@Builder
public class ClubDto {

    private Long id;
    @NotEmpty(message = "Club title should not be empty")
    private String title;
    @NotEmpty(message = "PhotoUrl should not be empty")
    private String photoUrl;
    @NotEmpty(message = "Content should not be empty")
    private String content;
    private UserEntity createdBy;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<EventDto> events;

}
