package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.PetType
import com.sachet.sfgpetclinic.model.Speciality

interface SpecialityService {

    fun findById(id: Long): Speciality?
    fun findAll(): Set<Speciality>
    fun save(speciality: Speciality): Speciality
    fun delete(speciality: Speciality)
    fun deleteById(id: Long)

}