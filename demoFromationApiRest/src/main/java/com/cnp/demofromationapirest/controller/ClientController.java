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
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") Integer id) {
        Client client = new Client("toto","tata","0123456789");
        client.setId(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }


    //Ajouter un client
    @PostMapping("")
    public ResponseEntity<Client> postClient(@RequestBody Client client) {
        client.setId(2);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    //Modifier un client
    @PutMapping("/{id}")
    public String putClient(@PathVariable("id") Integer id, @RequestBody Client client) {

        return "ok put "+id;
    }

    //Supprimer un client
    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable("id") Integer id) {

        return  "ok delete "+id;
    }

}
