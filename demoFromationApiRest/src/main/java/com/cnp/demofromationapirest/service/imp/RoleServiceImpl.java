package com.cnp.demofromationapirest.service.imp;


import com.cnp.demofromationapirest.model.Role;
import com.cnp.demofromationapirest.repository.RoleRepository;
import com.cnp.demofromationapirest.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        Role role = roleRepository.findRoleByName(name);
        return role;
    }
}
