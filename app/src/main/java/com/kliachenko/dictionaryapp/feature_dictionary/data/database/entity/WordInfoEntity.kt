package com.kliachenko.dictionaryapp.feature_dictionary.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kliachenko.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.kliachenko.dictionaryapp.feature_dictionary.domain.model.WordInfo

@Entity(tableName = "words")
data class WordInfoEntity(
    @PrimaryKey
    val id: Int? = null,
    val word: String,
    val origin: String,
    val phonetic: String,
    val meanings: List<Meaning>
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            origin = origin,
            phonetic = phonetic
        )
    }
}
