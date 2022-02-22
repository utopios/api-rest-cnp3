package com.cnp.demofromationapirest.service;





import com.cnp.demofromationapirest.model.User;
import com.cnp.demofromationapirest.model.UserDto;

import java.util.List;

public interface UserService {
    
    User save(UserDto user);

    List<User> findAll();

    User findOne(String username);
}
