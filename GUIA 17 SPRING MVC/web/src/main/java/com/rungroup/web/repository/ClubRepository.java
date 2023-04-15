package com.rungroup.web.repository;

import com.rungroup.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


//each repository must have its own entity.
//only has crud methods
//perform crud actions
//turn db tables into objects so they can travel throw the services and display into the webpage

public interface ClubRepository extends JpaRepository<Club, Long> {

    //java will do the coding


    Optional<Club> findByTitle(String url);
    @Query("SELECT c from Club c WHERE c.title LIKE CONCAT('%',:query,'%')")
    List<Club> searchClubs(String query);

}
