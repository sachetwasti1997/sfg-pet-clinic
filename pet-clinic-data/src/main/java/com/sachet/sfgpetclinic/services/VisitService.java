package com.sachet.sfgpetclinic.services;

import com.sachet.sfgpetclinic.model.Visits;

import java.util.Set;

public interface VisitService {

    Set<Visits> findAll();

    Visits findById(Long id);

    Visits save(Visits visits);

    void delete(Visits visits);

    void deleteById(Long id);

}
