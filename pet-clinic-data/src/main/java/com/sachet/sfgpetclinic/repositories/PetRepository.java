package com.sachet.sfgpetclinic.repositories;

import com.sachet.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<PetType, Long> {
}
