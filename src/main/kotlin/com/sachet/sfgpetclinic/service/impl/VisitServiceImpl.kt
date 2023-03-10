package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.Visit
import com.sachet.sfgpetclinic.repository.VisitRepository
import com.sachet.sfgpetclinic.service.VisitService
import org.springframework.stereotype.Service

@Service
class VisitServiceImpl(
    val visitRepository: VisitRepository
) : VisitService {
    override fun findById(id: Long): Visit? {
        return visitRepository.findById(id).orElse(null)
    }

    override fun findAll(): Set<Visit> {
        val visits = HashSet<Visit>()
        visitRepository.findAll()
            .forEach { visit ->
                visits.add(visit)
            }
        return visits
    }

    override fun save(visit: Visit): Visit {
        return visitRepository.save(visit)
    }

    override fun delete(visit: Visit) {
        visitRepository.delete(visit)
    }

    override fun deleteById(id: Long) {
        visitRepository.deleteById(id)
    }
}