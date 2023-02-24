package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.Vet

interface VetService {
    fun findById(id: Long): Vet
    fun save(vet: Vet): Vet
    fun findAll(): Set<Vet>
}