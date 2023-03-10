package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.Owner
import com.sachet.sfgpetclinic.repository.OwnerRepository
import com.sachet.sfgpetclinic.service.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceImpl(
    val ownerRepository: OwnerRepository
) : OwnerService {
    override fun findByLastName(lastName: String): Owner? {
        return ownerRepository.findByLastName(lastName)
    }

    override fun findById(id: Long): Owner? {
        return ownerRepository.findById(id).orElse(null)
    }

    override fun save(owner: Owner): Owner {
        return ownerRepository.save(owner)
    }

    override fun findAll(): Set<Owner> {
        val owners = HashSet<Owner>()
        ownerRepository
            .findAll()
            .forEach { owner ->
                owners.add(owner)
            }
        return owners
    }

    override fun delete(owner: Owner) {
        ownerRepository.delete(owner)
    }

    override fun deleteById(id: Long) {
        ownerRepository.deleteById(id)
    }
}