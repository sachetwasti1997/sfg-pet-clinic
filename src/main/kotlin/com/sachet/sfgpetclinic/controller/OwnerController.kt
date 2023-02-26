package com.sachet.sfgpetclinic.controller

import com.sachet.sfgpetclinic.model.Owner
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/owner")
class OwnerController {
    @RequestMapping("/all")
    fun listOwners() : ResponseEntity<List<Owner>> {
        return ResponseEntity(emptyList(), HttpStatus.OK)
    }
}