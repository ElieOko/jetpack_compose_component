package com.example.jc_component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jc_component.component.text.TextCell

@Composable
@Preview(showBackground = true)
fun RowScreen(){
    Row {
        TextCell("1", modifier = Modifier.background(Color.Blue))
        TextCell("2")
        TextCell("3", modifier = Modifier.background(Color.Red))
    }
}