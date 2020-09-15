package com.vandenbreemen.modernsimmingui

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

@Composable
fun HelloCompose(){
    Text (text = "Hello Wsssorld from Compose")
}

@Preview
@Composable
fun PreviewHelloCompose() {
    HelloCompose()
}