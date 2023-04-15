package com.library.library.service.impl;

import com.library.library.exceptions.MyException;
import com.library.library.model.Image;
import com.library.library.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    private ImageRepository imageRepository;
    @Autowired
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image save(MultipartFile file) throws MyException{
        if (file!=null){
            try {
                Image image = new Image();
                image.setMime(file.getContentType());
                image.setName(file.getName());
                image.setContent(file.getBytes());
                return imageRepository.save(image);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

    public Image upload(MultipartFile file, String idImage) throws MyException {
        if (file!=null){
            try {
                Image image = new Image();
                if (idImage!=null){
                    Optional<Image> answer=imageRepository.findById(idImage);
                    if (answer.isPresent()){
                        image=answer.get();
                    }
                }

                image.setMime(file.getContentType());
                image.setName(file.getName());
                image.setContent(file.getBytes());
                return imageRepository.save(image);

            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

    @Transactional(readOnly = true)
    public List<Image> listImg(){
        return imageRepository.findAll();
    }


}
