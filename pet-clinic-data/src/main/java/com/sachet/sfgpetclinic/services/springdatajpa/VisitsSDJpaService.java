package com.sachet.sfgpetclinic.services.springdatajpa;

import com.sachet.sfgpetclinic.model.Visits;
import com.sachet.sfgpetclinic.repositories.VisitRepository;
import com.sachet.sfgpetclinic.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VisitsSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    @Autowired
    public VisitsSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visits> findAll() {
        Set<Visits> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visits findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visits save(Visits visits) {
        return visitRepository.save(visits);
    }

    @Override
    public void delete(Visits visits) {
        visitRepository.delete(visits);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
