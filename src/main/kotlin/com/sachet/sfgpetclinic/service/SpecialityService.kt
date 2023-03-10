package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.PetType
import com.sachet.sfgpetclinic.model.Speciality

interface SpecialityService {

    fun findById(id: Long): Speciality
    fun findAll(): Set<Speciality>
    fun save(petType: PetType): PetType
    fun delete(petType: PetType)
    fun deleteById(id: Long)

}