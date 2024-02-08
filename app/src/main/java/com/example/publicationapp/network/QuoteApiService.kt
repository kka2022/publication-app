package com.example.publicationapp.network

import com.example.publicationapp.model.Quote
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL = "https://api.quotable.io/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface QuoteApiService {
    @GET("random")
    suspend fun getRandomQuote(): Quote
}

object QuoteApi {
    val retrofitService: QuoteApiService by lazy {
        retrofit.create(QuoteApiService::class.java)
    }
}