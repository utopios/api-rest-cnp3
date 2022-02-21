package com.cnp.demofromationapirest.controller;

import com.cnp.demofromationapirest.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    //Récupérer la totalité des clients
    @GetMapping("")
    public List<Client> getClients() {
        return new ArrayList<>();
    }


    //Récupérer un client par son id
    @GetMapping("/1")
    public ResponseEntity<Client> getClient() {
        return new ResponseEntity<>(new Client("toto","tata","0123456789"), HttpStatus.OK);
    }


    //Ajouter un client
    @PostMapping("")
    public ResponseEntity<Client> postClient(@RequestBody Client client) {
        client.setId(2);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    //Modifier un client
    @PutMapping("/1")
    public String putClient(Client client) {
        return "ok put";
    }

    //Supprimer un client
    @DeleteMapping("/1")
    public String deleteClient() {
        return  "ok delete";
    }

}
