package com.library.library.service;


import com.library.library.dto.AuthorDto;
import com.library.library.dto.EditorialDto;
import com.library.library.model.Editorial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EditorialService {

    List<EditorialDto> findAllEditorials();

    Editorial saveEditorial (EditorialDto editorialDto);

    void deleteEditorial (String editorialId);

    void updateEditorial (EditorialDto editorial);

    EditorialDto findEditorialById(String editorialId);
}
