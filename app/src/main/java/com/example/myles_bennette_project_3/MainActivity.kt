package com.example.myles_bennette_project_3

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myles_bennette_project_3.ui.theme.Myles_Bennette_Project_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Myles_Bennette_Project_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PokemonDisplayApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonDisplayApp() {
    Myles_Bennette_Project_3Theme {
        //Image(painter = painterResource(id = R.drawable.ae65c3041ec87e504d60e45ada3cbb17), contentDescription = null, contentScale = ContentScale.Crop, alpha = 1f)
        //Image(painter = painterResource(id = R.drawable.awesome_pokeball_cover_yr2d9wxouqfbvcol), contentDescription = null, contentScale = ContentScale.Crop, alpha = 1f)
        Image(painter = painterResource(id = R.drawable.hd_wallpaper_pokemon_pokeball_pokemon), contentDescription = null, contentScale = ContentScale.Crop, alpha = 1f)

        CycleImages1()
        CycleImages2()
        CycleImages3()

    }
}

@Composable
fun CycleImages1(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.CenterStart)){
    var isButtonClicked by remember {mutableStateOf(false)}

    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
    {

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {isButtonClicked = !isButtonClicked}) {
            Text(stringResource(R.string.img1))
        }
        if(isButtonClicked == true)
        {
            Image(painter = painterResource(R.drawable._98), contentDescription = "Tepig")
        }
    }
}
@Composable
fun CycleImages2(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)){
    var isButtonClicked by remember {mutableStateOf(false)}

        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
        {
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {isButtonClicked = !isButtonClicked}) {
                Text(stringResource(R.string.img2))
            }
            if(isButtonClicked == true)
            {
                Image(painter = painterResource(R.drawable._95), contentDescription = "Snivy")
            }
        }

}
@Composable
fun CycleImages3(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.CenterEnd)){
    var isButtonClicked by remember {mutableStateOf(false)}

        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
        {
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {isButtonClicked = !isButtonClicked}) {
                Text(stringResource(R.string.img3))
            }
            if(isButtonClicked == true)
            {
                Image(painter = painterResource(R.drawable._01), contentDescription = "Oshawott")
            }
        }
}
