package com.plcoding.contactscomposemultiplatform.contacts.domain

import kotlinx.coroutines.flow.Flow

interface ContactDataSource {
    fun getContacts() :Flow<List<Contact>>

    fun getRecentContact(): Flow<List<Contact>>

    suspend fun insetContact(contact: Contact)

    suspend fun deleteContact(id: Long)

}