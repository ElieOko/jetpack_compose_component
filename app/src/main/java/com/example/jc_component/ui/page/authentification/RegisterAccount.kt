package com.example.jc_component.ui.page.authentification

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc_component.component.button.MButtonStructure
import com.example.jc_component.component.topbar.SimpleTopBar
import com.example.jc_component.ui.theme.Blue350
import com.example.jc_component.ui.theme.GostWhite
import com.example.jc_component.ui.theme.Green100
import com.example.jc_component.ui.theme.Grey100
import com.example.jc_component.ui.theme.PurpleGrey80
import com.example.jc_component.ui.theme.Vacant
import com.example.jc_component.ui.theme.WhiteOff

@Composable()
fun RegisterAccount(){

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable()
fun RegisterAccountBody(){
  Surface(
    Modifier.background(WhiteOff)
  ) {
      Scaffold(
          topBar = {
              SimpleTopBar(
                  colorIcon = Color.Black,
                  iconStart = Icons.Filled.Close,
                  titleMain = "Création Client",
                  paddingSurface = 0
              )
          }
      ) {
          Column(modifier = Modifier
              .fillMaxSize()
              .padding(8.dp)

          ) {
              Spacer(modifier = Modifier.height(85.dp))
              Text(text = "Posez vos valises dans votre chez-vous idéal", fontSize = 24.sp, overflow = TextOverflow.Ellipsis, fontWeight = FontWeight.Bold, color = Green100)
              Spacer(modifier = Modifier.height(10.dp))
              Text(text = "Trouvez des photos, des descriptions détaillées et des visites virtuelles pour vous aider à vous faire une idée des propriétés", fontSize = 17.sp, color = Grey100)
              Spacer(modifier = Modifier.height(5.dp))
              Surface(Modifier.padding(34.dp)) {
                  MButtonStructure(
                      contentDesc ="Se connecter",
                      backgroundColor = Blue350,
                      modifier =Modifier.fillMaxWidth(),
                      click = {},
                      content = {}
                  )
              }
              Column(
                  Modifier
                      .fillMaxWidth()
                      .padding(2.dp)
              ) {
                 Row(
                     Modifier
                         .fillMaxWidth()
                         .padding(2.dp)) {
                     Text(text = "Nom", fontSize = 17.sp, fontWeight = FontWeight.Bold)
                     Spacer(modifier = Modifier.width(3.dp))
                     Icon(Icons.Filled.Info,contentDescription = null, tint = Blue350 )
                 }
                  OutlinedTextField(
                      modifier = Modifier.fillMaxWidth(),
                      value = "",
                      onValueChange = {},
                      placeholder = { Text("") } ,
                      shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp)
                  )
                  Spacer(modifier = Modifier.height(15.dp))
                  Text(text = "Prenom", fontSize = 17.sp, fontWeight = FontWeight.Bold)
                  OutlinedTextField(
                      modifier = Modifier.fillMaxWidth(),
                      value = "",
                      onValueChange = {},
                      placeholder = { Text("") } ,
                      shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp)
                  )
                  Spacer(modifier = Modifier.height(15.dp))
                  Row(
                      Modifier
                          .fillMaxWidth()
                          .padding(2.dp)) {
                      Text(text = "Téléphone", fontSize = 17.sp, fontWeight = FontWeight.Bold)
                      Spacer(modifier = Modifier.width(3.dp))
                      Icon(Icons.Filled.Info,contentDescription = null, tint = Blue350 )
                  }
                  OutlinedTextField(
                      modifier = Modifier.fillMaxWidth(),
                      value = "",
                      onValueChange = {},
                      placeholder = { Text("+243 xxx-xxx-xx-xx") } ,
                      shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp)
                  )
              }
          }
      }
  }
}

@Composable()
@Preview(
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "DefaultPreviewLight"
)
fun RegisterAccountReview(){
    RegisterAccountBody()
}