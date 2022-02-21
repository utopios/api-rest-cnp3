package com.cnp.demofromationapirest.service.imp;

import com.cnp.demofromationapirest.dto.ClientDTO;
import com.cnp.demofromationapirest.model.Client;
import com.cnp.demofromationapirest.repository.ClientRepository;
import com.cnp.demofromationapirest.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getAllClient() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public ClientDTO getClientById(int id) {
        return new ModelMapper().map(clientRepository.findById(id).get(), ClientDTO.class);
    }

    @Override
    public Client updateClient(Client client, int id) {
        Client clientExist = clientRepository.findById(id).get();
        clientExist.setNom(client.getNom());
        clientExist.setPrenom(client.getPrenom());
        clientExist.setTelephone(client.getTelephone());
        return clientRepository.save(clientExist);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public boolean deleteClient(int id) {
        Client clientExist = clientRepository.findById(id).get();
        clientRepository.delete(clientExist);
        return true;
    }
}