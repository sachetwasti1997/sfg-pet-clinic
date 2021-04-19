package com.sachet.sfgpetclinic.repositories;

import com.sachet.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

}
