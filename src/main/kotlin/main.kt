import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.text.createTextLayoutResult
import androidx.compose.ui.unit.dp

fun main() = Window {

    Column {
        setUi()
    }


}

@Composable
fun setUi(){
    Scaffold(modifier = Modifier , bottomBar = { })
    {

        Column {
            Dasboard()
            button()
        }



    }
}


@Composable
fun Dasboard(){

    Card(modifier = Modifier
        .height(400.dp)
        .fillMaxWidth()
        .padding(18.dp),
        backgroundColor = Color.DarkGray ,
        shape = RoundedCornerShape(20.dp))
    {

    }
}

@Composable
fun button(){
    Row (modifier = Modifier.fillMaxSize() , horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically)
    {
        Button( onClick = {}) {
            Text("Click Me 1")

        }

        Button( onClick = {} , modifier = Modifier ,colors = (ButtonDefaults.buttonColors())){
            Text("Click Me 2")

        }
        Button( onClick = {}, colors = (ButtonDefaults.buttonColors())) {
            Text("Click Me 3")

        }

        Button( onClick = {}, colors = (ButtonDefaults.buttonColors())){
            Text("Click Me 4")

        }

    }
}


@Composable
fun icon(){

}
