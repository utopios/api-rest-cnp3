package com.cnp.demofromationapirest.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    //Récupérer la totalité des clients
    @GetMapping("")
    public List<String> getClients() {
        return new ArrayList<>();
    }


    //Récupérer un client par son id
    @GetMapping("/1")
    public String getClient() {
        return "un client";
    }


    //Ajouter un client
    @PostMapping("")
    public String postClient() {
        return "Ok";
    }

    //Modifier un client
    @PutMapping("/1")
    public String putClient() {
        return "ok put";
    }

    //Supprimer un client
    @DeleteMapping("/1")
    public String deleteClient() {
        return  "ok delete";
    }

}
