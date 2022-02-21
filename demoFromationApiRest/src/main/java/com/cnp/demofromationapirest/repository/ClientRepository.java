package com.cnp.demofromationapirest.repository;

import com.cnp.demofromationapirest.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    public List<Client> findClientByNom(String nom);
}
