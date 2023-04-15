package com.library.library.mapper;

import com.library.library.dto.EditorialDto;
import com.library.library.model.Editorial;

public class EditorialMapper {


    public static Editorial mapToEditorial(EditorialDto editorial){
        Editorial editorialDto = Editorial.builder()
                .id(editorial.getId())
                .name(editorial.getName())
                .build();
        return editorialDto;
    }

    public static EditorialDto mapToEditorialDto(Editorial editorial) {
        EditorialDto editorialDto = EditorialDto.builder()
                .id(editorial.getId())
                .name(editorial.getName())
                .build();
        return editorialDto;
    }
}
