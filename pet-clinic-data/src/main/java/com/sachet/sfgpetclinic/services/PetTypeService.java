package com.sachet.sfgpetclinic.services;

import com.sachet.sfgpetclinic.model.PetType;

import java.util.Set;

public interface PetTypeService {

    Set<PetType> findAll();

    PetType findById(Long id);

    PetType save(PetType petType);

    void delete(PetType petType);

    void deleteById(Long id);

}
