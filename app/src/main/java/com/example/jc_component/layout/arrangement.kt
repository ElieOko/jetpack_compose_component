package com.example.jc_component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jc_component.component.text.TextCell

@Composable
@Preview(showBackground = true)
fun MainUXUI(){
    ArrangementColumn()
}

@Composable
fun ArrangementRow(){
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.size(width = 400.dp, height = 200.dp)) {
        TextCell("1", modifier = Modifier.background(Color.Blue))
        TextCell("2")
        TextCell("3", modifier = Modifier.background(Color.Red))
    }
}

@Composable
fun ArrangementColumn(){
    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.height(400.dp)) {
        TextCell("1", modifier = Modifier.background(Color.Blue))
        TextCell("2")
        TextCell("3", modifier = Modifier.background(Color.Red))
    }
}