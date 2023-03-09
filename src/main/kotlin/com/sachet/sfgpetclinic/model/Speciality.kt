package com.sachet.sfgpetclinic.model

import jakarta.persistence.Entity

@Entity
class Speciality (
    var description: String ?= null
): BaseEntity()