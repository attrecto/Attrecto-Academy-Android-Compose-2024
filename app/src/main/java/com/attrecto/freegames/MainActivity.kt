package com.attrecto.freegames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.attrecto.freegames.ui.theme.FreeGamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // TODO 1: Theme, Color, Type
            FreeGamesTheme {
                // A surface container using the 'background' color from the theme
                // TODO 3: modifierek, theme használata
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")

                    // TODO 4: Tegyünk ki a képernyőre még egy szöveget, legyen a Greeting alatt.

                    // TODO 5: Tegyünk ki a képernyőre egy ikont, ez legyen az előző kettő szöveg mellett balra.

                    // TODO 6: Tegyünk ki egy listányi szöveget.

                    // TODO 7: Tegyünk ki egy TextFieldet.

                    // TODO 8: LaunchedEffecttel logoljunk ki egy checkbox változásait
                }
            }
        }
    }
}

// TODO 2: Mi az a Composable?
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

// TODO 3: Mi az a Preview?
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FreeGamesTheme {
        Greeting("Android")
    }
}