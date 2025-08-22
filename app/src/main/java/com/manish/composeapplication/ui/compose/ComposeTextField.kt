package com.manish.composeapplication.ui.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ComposeOutlineTextField(
    placeHolder: String,
    isPassword: Boolean,
    isEmail: Boolean,
    isNumber: Boolean,
) {
    val textFieldState = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = textFieldState.value,
        onValueChange = {
            textFieldState.value = it
        },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        placeholder = {
            Text(placeHolder)
        },
        keyboardOptions = if (isEmail) {
            KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        } else if (isPassword) {
            KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        } else if (isNumber) {
            KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        } else {
            KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        }
    )
}

@Composable
fun OutlineTextFieldImage() {
    val textFieldState = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = textFieldState.value,
        onValueChange = {
            textFieldState.value = it
        },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        placeholder = {
            Text("Name")
        },
        leadingIcon = {
            androidx.compose.material3.Icon(
                painter = androidx.compose.ui.res.painterResource(id = com.manish.composeapplication.R.drawable.profile),
                contentDescription = "User Icon"
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text
        )
    )
}

@Composable
@Preview
fun OutlineTextFieldImagePreview() {
    OutlineTextFieldImage()
}