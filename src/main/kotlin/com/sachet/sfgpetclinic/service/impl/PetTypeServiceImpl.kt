package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.PetType
import com.sachet.sfgpetclinic.repository.PetTypeRepository
import com.sachet.sfgpetclinic.service.PetTypeService
import org.springframework.stereotype.Service

@Service
class PetTypeServiceImpl(
    val petTypeRepository: PetTypeRepository
) : PetTypeService {
    override fun findById(id: Long): PetType? {
        return petTypeRepository.findById(id).orElse(null)
    }

    override fun save(petType: PetType): PetType {
        return petTypeRepository.save(petType)
    }

    override fun findAll(): Set<PetType> {
        val petTypes = HashSet<PetType>()
        petTypeRepository.findAll()
            .forEach { petType ->
                petTypes.add(petType)
            }
        return petTypes
    }

    override fun delete(petType: PetType) {
        petTypeRepository.delete(petType)
    }

    override fun deleteById(id: Long) {
        petTypeRepository.deleteById(id)
    }
}