package com.sachet.sfgpetclinic.model

import jakarta.persistence.Entity

@Entity
class PetType (
    var name: String ?= null
): BaseEntity()
