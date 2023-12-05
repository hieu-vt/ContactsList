package com.plcoding.contactscomposemultiplatform.contacts.data

import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact
import database.ContactEntity

fun ContactEntity.toContact(): Contact {
    return Contact(
        id = id,
        email = email,
        firstName = firstName,
        phoneNumber = phoneNumber,
        lastName = lastName,
        photoBytes = null // TODO: Get the images
    )
}