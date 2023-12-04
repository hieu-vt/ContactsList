package com.plcoding.contactscomposemultiplatform

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.plcoding.contactscomposemultiplatform.contacts.presentation.ContactListViewModel
import com.plcoding.contactscomposemultiplatform.contacts.presentation.components.ContactListScreen
import com.plcoding.contactscomposemultiplatform.core.presentation.ContactTheme
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
){
    val viewModel = getViewModel(
        key = "contact-list-screen",
        factory = viewModelFactory {
            ContactListViewModel()
        }
    )

    val state by viewModel.state.collectAsState()

    ContactTheme(darkTheme = darkTheme, dynamicColor = dynamicColor) {
        ContactListScreen(
            state = state,
            newContact = viewModel.newContact,
            onEvent = viewModel::onEvent
        )
    }
}