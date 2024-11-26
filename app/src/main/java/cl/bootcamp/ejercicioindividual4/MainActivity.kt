package cl.bootcamp.ejercicioindividual4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.bootcamp.ejercicioindividual4.ui.theme.EjercicioIndividual4Theme
import cl.bootcamp.ejercicioindividual4.view.HomeView
import cl.bootcamp.ejercicioindividual4.viewModel.ArticlesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        val viewModel: ArticlesViewModel by viewModels()
        setContent {
            EjercicioIndividual4Theme {
                HomeView(viewModel)
            }
        }
    }
}


