package com.kliachenko.dictionaryapp.feature_dictionary.data.network.dto

import com.kliachenko.dictionaryapp.feature_dictionary.data.database.entity.WordInfoEntity
import com.kliachenko.dictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }

}