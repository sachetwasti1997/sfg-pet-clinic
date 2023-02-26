package com.sachet.sfgpetclinic.controller

import com.sachet.sfgpetclinic.model.Vet
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/vets")
class VetController {

    @RequestMapping("/all")
    fun listVets(): ResponseEntity<List<Vet>> {
        return ResponseEntity(emptyList(), HttpStatus.OK)
    }

}