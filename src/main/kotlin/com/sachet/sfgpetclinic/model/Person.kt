package com.sachet.sfgpetclinic.model

import jakarta.persistence.MappedSuperclass

@MappedSuperclass
open class Person(
    var firstName: String ?= null,
    var lastName: String ?= null
): BaseEntity()