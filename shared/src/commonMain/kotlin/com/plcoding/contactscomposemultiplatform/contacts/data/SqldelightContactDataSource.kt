package com.plcoding.contactscomposemultiplatform.contacts.data

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactDataSource
import com.plcoding.contactscomposemultiplatform.database.ContactDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SqldelightContactDataSource (
    db : ContactDatabase
): ContactDataSource {

    private val queries = db.contactQueries
    override fun getContacts(): Flow<List<Contact>> {
        return queries
            .getContacts()
            .asFlow()
            .mapToList()
            .map { contactEntites ->
                contactEntites.map { contactEntity ->
                    contactEntity.toContact()
                }
            }
    }

    override fun getRecentContact(): Flow<List<Contact>> {
        TODO("Not yet implemented")
    }

    override suspend fun insetContact(contact: Contact) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteContact(id: Long) {
        TODO("Not yet implemented")
    }

}
