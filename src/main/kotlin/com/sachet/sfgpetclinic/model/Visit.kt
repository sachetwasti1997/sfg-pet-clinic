package com.sachet.sfgpetclinic.model

import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDate

@Entity
class Visit(
    var date: LocalDate ?= null,
    var description: String ?= null,
    @ManyToOne
    @JoinColumn(name = "pet_id")
    var pet: Pet ?= null
) :BaseEntity() {
}