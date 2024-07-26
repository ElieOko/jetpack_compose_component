package com.example.jc_component

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc_component.component.button.MButton
import com.example.jc_component.component.button.MButtonStructure
import com.example.jc_component.layout.RowScreen
import com.example.jc_component.ui.page.authentification.RegisterAccountBody
import com.example.jc_component.ui.theme.Black100
import com.example.jc_component.ui.theme.Green100
import com.example.jc_component.ui.theme.Jc_componentTheme
import com.example.jc_component.ui.theme.WhiteOff

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jc_componentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = WhiteOff
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Recomposition()
                        //RegisterAccountBody()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Recomposition(){
    val context = LocalContext.current
    val (getInput,setInput) = rememberSaveable { mutableStateOf("") }
    val onTextChange = {value : String ->
        setInput(value)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome $getInput", fontSize = 24.sp, overflow = TextOverflow.Ellipsis, fontWeight = FontWeight.Bold, color = Green100)
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Black100
            ),
            value = getInput,
            onValueChange = onTextChange,
            placeholder = { Text("") } ,
            shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp)
        )
        Spacer(modifier = Modifier.height(85.dp))
        //CheckBoxes(imageSelected = true, linearSelected = true, onTitleClick = {}, onLinearClick = {})
        SpanString()
        RowScreen()
        Spacer(modifier = Modifier.height(85.dp))
        MButtonStructure(
            click = {
                Toast.makeText(context, getInput,Toast.LENGTH_LONG).show()
            },
            content = {}
        )

    }
}

@Composable
fun CheckBoxes(linearSelected: Boolean, imageSelected: Boolean, onTitleClick: (Boolean) -> Unit, onLinearClick: (Boolean) -> Unit ) {
    Row( Modifier.padding(20.dp), verticalAlignment = Alignment.CenterVertically ) {
        Checkbox( checked = imageSelected, onCheckedChange = onTitleClick )
        Text("Image Title")
        Spacer(Modifier.width(20.dp))
        Checkbox(checked = linearSelected, onCheckedChange = onLinearClick )
        Text("Linear Progress")
    }
}
@Composable
fun SpanString(){
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.Blue
            )){
                append("H")
            }
            withStyle(style = SpanStyle(
                color = Color.Red
            )){
                append("E")
            }
            append("Y")
        }
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewRecomposition(){
    Recomposition()
}