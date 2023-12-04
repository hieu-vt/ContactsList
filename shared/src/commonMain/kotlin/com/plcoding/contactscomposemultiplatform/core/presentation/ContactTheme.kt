package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun ContactTheme (
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)