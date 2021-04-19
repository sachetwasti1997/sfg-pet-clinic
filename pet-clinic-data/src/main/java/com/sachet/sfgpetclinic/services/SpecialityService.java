package com.sachet.sfgpetclinic.services;

import com.sachet.sfgpetclinic.model.Speciality;

import java.util.Set;

public interface SpecialityService {

    Set<Speciality> findAll();

    Speciality findById(Long id);

    Speciality save(Speciality speciality);

    void delete(Speciality speciality);

    void deleteById(Long id);

}
