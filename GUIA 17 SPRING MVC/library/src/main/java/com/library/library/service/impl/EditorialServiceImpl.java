package com.library.library.service.impl;

import com.library.library.dto.AuthorDto;
import com.library.library.dto.EditorialDto;
import com.library.library.model.Editorial;
import com.library.library.repository.EditorialRepository;
import com.library.library.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.library.library.mapper.EditorialMapper.mapToEditorial;
import static com.library.library.mapper.EditorialMapper.mapToEditorialDto;

@Service
public class EditorialServiceImpl implements EditorialService {

    private EditorialRepository editorialRepository;
    @Autowired
    public EditorialServiceImpl(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    @Override
    public List<EditorialDto> findAllEditorials() {
        List<Editorial>editorials=editorialRepository.findAll();
        return editorials.stream().map(editorial -> mapToEditorialDto(editorial)).collect(Collectors.toList());

    }

    @Override
    public Editorial saveEditorial(EditorialDto editorialDto) {
        Editorial editorial = mapToEditorial(editorialDto);
        return editorialRepository.save(editorial);
    }

    @Override
    public void deleteEditorial(String editorialId) {
    editorialRepository.deleteById(editorialId);
    }

    @Override
    public void updateEditorial(EditorialDto editorialDto) {
        Editorial editorial = mapToEditorial(editorialDto);
        editorialRepository.save(editorial);
    }

    @Override
    public EditorialDto findEditorialById(String editorialId) {
        Editorial editorial = editorialRepository.findById(editorialId).get();
        return mapToEditorialDto(editorial);
    }
}
