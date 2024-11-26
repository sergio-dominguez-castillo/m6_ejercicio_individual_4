package cl.bootcamp.ejercicioindividual4.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cl.bootcamp.ejercicioindividual4.viewModel.ArticlesViewModel

@Composable
fun HomeView(viewModel: ArticlesViewModel) {

    val articles by viewModel.articles.collectAsState()

    LazyColumn {
        items(articles) { item ->
            Text(text = item.source.name)
        }
    }
}