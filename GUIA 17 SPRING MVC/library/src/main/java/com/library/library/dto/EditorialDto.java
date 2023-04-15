package com.library.library.dto;

import javax.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EditorialDto {
    private String id;
    @NotEmpty(message = "Editorial name should not be empty")
    private String name;
}
