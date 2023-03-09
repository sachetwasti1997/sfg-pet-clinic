package com.sachet.sfgpetclinic.model

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

@Entity
class Vet(
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = [JoinColumn(name = "vet_id")]
    , inverseJoinColumns = [JoinColumn(name = "speciality_id")])
    val specialities: MutableSet<Speciality> = HashSet()
): Person() {
}