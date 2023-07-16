package com.kliachenko.dictionaryapp.feature_dictionary.data.network

import com.kliachenko.dictionaryapp.feature_dictionary.data.network.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word: String
    ): List<WordInfoDto>
}