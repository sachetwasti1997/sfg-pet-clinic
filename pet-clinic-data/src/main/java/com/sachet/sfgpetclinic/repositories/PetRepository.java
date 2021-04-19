package com.sachet.sfgpetclinic.repositories;

import com.sachet.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
