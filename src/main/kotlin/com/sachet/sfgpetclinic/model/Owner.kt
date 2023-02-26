package com.sachet.sfgpetclinic.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany

@Entity
class Owner(
    var address: String ?= null,
    var city: String ?= null,
    var telephone: String ?= null,
    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "owner")
    var pets: MutableSet<Pet> = HashSet()
): Person() {
}