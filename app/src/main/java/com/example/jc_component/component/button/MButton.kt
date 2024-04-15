package com.example.jc_component.component.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MButton(){
    MButtonStructure(
        click = {},
    )
}

@Composable
fun MButtonStructure(
    modifier : Modifier = Modifier,
    contentDesc : String = "Connexion UI",
    click : () -> Unit,
    backgroundColor :Color = Color.Black,
    enabled : Boolean = true,
    sizeBorder : Int = 12,

){
    Button(
        onClick = { click() },
        modifier =modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        ),
        enabled = enabled,
        shape = RoundedCornerShape(sizeBorder.dp)
        )
    {
        Text(text = contentDesc)
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewMButton(){
    MButtonStructure(
        click = {},
    )
//    Box(
//        modifier = Modifier
//            .drawWithCache {
//                val roundedPolygon = RoundedPolygon(
//                    numVertices = 3,
//                    radius = size.minDimension / 2,
//                    centerX = size.width / 2,
//                    centerY = size.height / 2,
//                    rounding = CornerRounding(
//                        size.minDimension / 10f,
//                        smoothing = 0.1f
//                    )
//                )
//                val roundedPolygonPath = roundedPolygon.toPath().asComposePath()
//                onDrawBehind {
//                    drawPath(roundedPolygonPath, color = Color.Black)
//                }
//            }
//            .size(100.dp)
//    )
}