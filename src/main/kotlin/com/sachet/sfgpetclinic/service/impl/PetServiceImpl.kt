package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.Pet
import com.sachet.sfgpetclinic.repository.PetRepository
import com.sachet.sfgpetclinic.service.PetService
import org.springframework.stereotype.Service

@Service
class PetServiceImpl(
    val petRepository: PetRepository
) : PetService {
    override fun findById(id: Long): Pet? {
        return petRepository.findById(id).orElse(null)
    }

    override fun save(pet: Pet): Pet {
        return petRepository.save(pet)
    }

    override fun findAll(): Set<Pet> {
        val pets = HashSet<Pet>()
        petRepository.findAll()
            .forEach { pet ->
                pets.add(pet)
            }
        return pets
    }

    override fun delete(pet: Pet) {
        petRepository.delete(pet)
    }

    override fun deleteById(id: Long) {
        petRepository.deleteById(id)
    }
}