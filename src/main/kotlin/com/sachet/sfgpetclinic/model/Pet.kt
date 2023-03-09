package com.sachet.sfgpetclinic.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import java.time.LocalDate

@Entity
class Pet (
    var name: String ?= null,
    @ManyToOne
    @JoinColumn(name = "type_id")
    var petType: PetType ?= null,
    @ManyToOne
    @JoinColumn(name="owner_id")
    var owner: Owner ?= null,
    var birthDate: LocalDate ?= null,
    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "pet")
    var visits: HashSet<Visit> = HashSet()
) : BaseEntity()