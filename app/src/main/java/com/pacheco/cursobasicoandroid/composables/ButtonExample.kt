package com.pacheco.cursobasicoandroid.composables

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text

@Preview
@Composable
fun ButtonExample(){
    Button(onClick = { print("Hola") }) {
        Text("Pulsame")
    }
}