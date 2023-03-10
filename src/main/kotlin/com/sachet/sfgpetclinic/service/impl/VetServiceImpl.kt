package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.Vet
import com.sachet.sfgpetclinic.repository.VetRepository
import com.sachet.sfgpetclinic.service.VetService
import org.springframework.stereotype.Service

@Service
class VetServiceImpl(
    val vetRepository: VetRepository
) : VetService {
    override fun findById(id: Long): Vet {
        return vetRepository.findById(id).get()
    }

    override fun save(vet: Vet): Vet {
        return vetRepository.save(vet)
    }

    override fun findAll(): Set<Vet> {
        val vets = HashSet<Vet>()
        vetRepository.findAll().forEach { vet ->
            vets.add(vet)
        }
        return vets
    }

    override fun delete(vet: Vet) {
        vetRepository.delete(vet)
    }

    override fun deleteById(id: Long) {
        vetRepository.deleteById(id)
    }
}