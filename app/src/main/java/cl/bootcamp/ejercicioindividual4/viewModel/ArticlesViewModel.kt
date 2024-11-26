package cl.bootcamp.ejercicioindividual4.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.bootcamp.ejercicioindividual4.model.ArticleList
import cl.bootcamp.ejercicioindividual4.repository.ArticlesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ArticlesViewModel @Inject constructor(private val repository: ArticlesRepository): ViewModel() {

    private val _articles = MutableStateFlow<List<ArticleList>>(emptyList())
    val articles = _articles.asStateFlow()

    init {
        fetchArticles()
    }

    private fun fetchArticles() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getArticles()
            _articles.value = result ?: emptyList()
            //Log.w(TAG, "")
        }
    }
}