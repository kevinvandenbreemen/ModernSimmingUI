package com.vandenbreemen.modernsimmingui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun GroupsList(groupNames: Array<String>) {

    Column(modifier = Modifier.padding(10.dp)) {
        Text(text = "Soon")
        Text("To")
        Text("Come")
    }

}

@Composable
@Preview
fun PreviewGroupsList() {
    GroupsList(groupNames = arrayOf("group1", "group2", "group3"))
}