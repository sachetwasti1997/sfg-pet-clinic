package com.sachet.sfgpetclinic.model

import java.time.LocalDate

class Pet (
    var petType: PetType ?= null,
    var owner: Owner ?= null,
    var birtthDate: LocalDate ?= null
)