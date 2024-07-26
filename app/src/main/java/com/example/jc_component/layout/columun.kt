package com.example.jc_component.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jc_component.component.text.TextCell

@Composable
@Preview(showBackground = true)
fun ColumnScreen(){
   Row {
       Column {
           TextCell(text = "2")
           TextCell(text = "4")
           TextCell(text = "1")
       }
       Column {
           TextCell(text = "5")
           TextCell(text = "3")
           TextCell(text = "6")
       }
       Column {
           TextCell(text = "9")
           TextCell(text = "7")
           TextCell(text = "8")
       }
   }
}