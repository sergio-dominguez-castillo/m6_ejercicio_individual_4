package cl.bootcamp.ejercicioindividual4.data

import cl.bootcamp.ejercicioindividual4.model.ArticlesModel
import cl.bootcamp.ejercicioindividual4.util.Constants.Companion.API_KEY
import cl.bootcamp.ejercicioindividual4.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiArticles {
    @GET(ENDPOINT + API_KEY)
    suspend fun getArticles(): Response<ArticlesModel>

    // esta en revision, no he logrado que funcione por el name
    @GET("$ENDPOINT/{name}$API_KEY")
    suspend fun getArticleByName(@Path(value = "name") name: String): Response<ArticlesModel>
}