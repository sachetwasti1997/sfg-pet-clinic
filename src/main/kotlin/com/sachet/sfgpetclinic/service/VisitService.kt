package com.sachet.sfgpetclinic.service

import com.sachet.sfgpetclinic.model.Visit

interface VisitService {

    fun findById(id: Long): Visit?
    fun findAll(): Set<Visit>
    fun save(visit: Visit): Visit
    fun delete(visit: Visit)
    fun deleteById(id: Long)

}