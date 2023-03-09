package com.sachet.sfgpetclinic.repository

import com.sachet.sfgpetclinic.model.*
import org.springframework.data.repository.CrudRepository

interface OwnerRepository: CrudRepository<Owner, Long> {
    fun findByLastName(lastName: String): Owner ?
}

interface PetRepository: CrudRepository<Pet, Long>

interface PetTypeRepository: CrudRepository<PetType, Long>

interface SpecialityRepository: CrudRepository<Speciality, Long>

interface VetRepository: CrudRepository<Vet, Long>

interface VisitRepository: CrudRepository<Visit, Long>

