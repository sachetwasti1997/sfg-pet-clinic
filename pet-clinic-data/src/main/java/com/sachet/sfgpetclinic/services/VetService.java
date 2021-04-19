package com.sachet.sfgpetclinic.services;

import com.sachet.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

    void delete(Vet vet);

    void deleteById(Long id);

}
