package com.sachet.sfgpetclinic.service.impl

import com.sachet.sfgpetclinic.model.Owner
import com.sachet.sfgpetclinic.repository.OwnerRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito
import java.util.*
import kotlin.collections.HashSet

class OwnerServiceImplTest {

    private val LAST_NAME = "Smith"
    private val ownerRepository = Mockito.mock(OwnerRepository::class.java)
    private lateinit var ownerServiceImpl: OwnerServiceImpl
    private lateinit var returnOwner: Owner;
    @BeforeEach
    fun setUp() {
        ownerServiceImpl = OwnerServiceImpl(ownerRepository)
        returnOwner = Owner().apply {
            id = 1L
            lastName = LAST_NAME
        }
    }

    @Test
    fun findByLastName() {
        Mockito.`when`(ownerRepository.findByLastName(LAST_NAME)).thenReturn(returnOwner)
        val smith = ownerServiceImpl.findByLastName(LAST_NAME)
        assertEquals(LAST_NAME, smith?.lastName)
        Mockito.verify(ownerRepository, Mockito.times(1)).findByLastName(LAST_NAME)
    }

    @Test
    fun findById() {
        Mockito.`when`(ownerRepository.findById(1L)).thenReturn(Optional.of(returnOwner))
        val returned = ownerServiceImpl.findById(1L)
        assertNotNull(returned)
        assertEquals(1L, returned?.id)
        assertEquals(LAST_NAME, returned?.lastName)
    }

    @Test
    fun findByIdNotFound() {
        Mockito.`when`(ownerRepository.findById(1L)).thenReturn(Optional.empty())
        val owner = ownerServiceImpl.findById(1L)
        assertNull(owner)
    }

    @Test
    fun save() {
        val ownerToSave = Owner().apply { id = 1L }
        Mockito.`when`(ownerRepository.save(any())).thenReturn(returnOwner)
        val savedOwner = ownerServiceImpl.save(ownerToSave)
        assertNotNull(savedOwner)
        assertEquals(1L, savedOwner.id)
    }

    @Test
    fun findAll() {
        val owners = HashSet<Owner>()
        owners.add(Owner().apply {
            id = 1L
        })
        owners.add(Owner().apply {
            id = 2L
        })
        Mockito.`when`(ownerRepository.findAll()).thenReturn(owners)
        val ownersReturned = ownerServiceImpl.findAll()
        assertNotNull(ownersReturned)
        assertEquals(2, ownersReturned.size)
        Mockito.verify(ownerRepository, Mockito.times(1)).findAll()
    }

    @Test
    fun delete() {
        ownerServiceImpl.delete(returnOwner)
        Mockito.verify(ownerRepository, Mockito.times(1)).delete(any())
    }

    @Test
    fun deleteById() {
        ownerServiceImpl.deleteById(1L)
        Mockito.verify(ownerRepository, Mockito.times(1)).deleteById(1L)
    }
}