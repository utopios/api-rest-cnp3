package com.cnp.demofromationapirest.service;

import com.cnp.demofromationapirest.dto.ClientDTO;
import com.cnp.demofromationapirest.model.Client;
import com.cnp.demofromationapirest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientService {


    public List<Client> getAllClient();

    public ClientDTO getClientById(int id);

    public Client updateClient(Client client, int id) ;

    public Client createClient(Client client);
    public boolean deleteClient(int id) ;
}
