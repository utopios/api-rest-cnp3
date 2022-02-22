package com.cnp.demofromationapirest.service;


import com.cnp.demofromationapirest.model.Role;

public interface RoleService {
    Role findByName(String name);
}
