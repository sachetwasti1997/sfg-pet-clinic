package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.Pet

interface PetService {

    fun findById(id: Long): Pet
    fun save(pet: Pet): Pet
    fun findAll(): Set<Pet>
    fun delete(pet: Pet)


}