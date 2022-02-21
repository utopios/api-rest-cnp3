package com.cnp.demofromationapirest.service;

import com.cnp.demofromationapirest.model.Contrat;

import java.util.List;
import java.util.Optional;

public interface ContratService {

    public List<Contrat> getListContrat();

    public Optional<Contrat> getContratById(Integer idContrat);

    public void deleteContrat(Integer idContrat);

    public Contrat modifyContrat(Contrat contrat);

    public Contrat createContrat(Contrat contrat);

}
