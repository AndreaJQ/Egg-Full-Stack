package com.rungroup.web.service;



/*in the Repository you have CRUD methods
but we have services as LAYERS OF ABSTRACTIONS
within a service you use various repository method.

interface makes it easier
but the interface must be implemented.


all of the repository methods will be used in the service for abstraction
* */


import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);
    ClubDto findClubById(Long clubId);
    void updateClub(ClubDto club);

    void detele(Long clubId);

    List<ClubDto> searchClubs(String query);


}
