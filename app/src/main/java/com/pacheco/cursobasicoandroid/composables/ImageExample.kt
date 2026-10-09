package com.pacheco.cursobasicoandroid.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.pacheco.cursobasicoandroid.R

@Preview
@Composable
fun ImageExample(){
    Image(painter = painterResource(id = R.drawable.img),
        contentDescription = "User avatar")
}