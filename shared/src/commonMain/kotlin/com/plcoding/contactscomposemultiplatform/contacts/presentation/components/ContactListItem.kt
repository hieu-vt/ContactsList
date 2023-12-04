package com.plcoding.contactscomposemultiplatform.contacts.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact

@Composable
fun ContactListItem(
    modifier: Modifier = Modifier,
    contact: Contact
){
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ContactPhoto(contact)

        Spacer(
            modifier = Modifier.width(16.dp)
        )

        Text(
            text = "${contact?.firstName} ${contact?.lastName}",
            modifier = Modifier.weight(1f)
        )
    }
}