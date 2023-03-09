package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.Owner

interface OwnerService {
    fun findByLastName(lastName: String): Owner?
    fun findById(id:Long): Owner
    fun save(owner: Owner): Owner
    fun findAll(): Set<Owner>

    fun delete(owner: Owner)

    fun deleteById(id: Long)
}