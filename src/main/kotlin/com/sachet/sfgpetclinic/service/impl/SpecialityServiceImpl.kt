package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.PetType
import com.sachet.sfgpetclinic.model.Speciality
import com.sachet.sfgpetclinic.repository.SpecialityRepository
import com.sachet.sfgpetclinic.service.SpecialityService
import org.springframework.stereotype.Service

@Service
class SpecialityServiceImpl(
    val specialityRepository: SpecialityRepository
) : SpecialityService {
    override fun findById(id: Long): Speciality? {
        return specialityRepository.findById(id).orElse(null)
    }

    override fun findAll(): Set<Speciality> {
        val specialities = HashSet<Speciality>()
        specialityRepository.findAll()
            .forEach { speciality ->
                specialities.add(speciality)
            }
        return specialities
    }

    override fun save(speciality: Speciality): Speciality {
        return specialityRepository.save(speciality)
    }

    override fun delete(speciality: Speciality) {
        specialityRepository.delete(speciality)
    }

    override fun deleteById(id: Long) {
        specialityRepository.deleteById(id)
    }
}