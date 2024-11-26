package cl.bootcamp.ejercicioindividual4.util

import cl.bootcamp.ejercicioindividual4.BuildConfig

class Constants {
     companion object {
          const val BASE_URL ="https://newsapi.org/v2/"
          const val ENDPOINT = "everything"
          const val API_KEY = BuildConfig.api_key
     }
}