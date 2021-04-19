package com.sachet.sfgpetclinic.services;

import com.sachet.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

    void delete(Pet pet);

    void deleteById(Long id);

}
