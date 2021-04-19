package com.sachet.sfgpetclinic.repositories;

import com.sachet.sfgpetclinic.model.Visits;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visits, Long> {
}
