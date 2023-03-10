package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.PetType

interface PetTypeService {

    fun findById(id: Long): PetType?
    fun save(petType: PetType): PetType
    fun findAll(): Set<PetType>
    fun delete(petType: PetType)
    fun deleteById(id: Long)

}