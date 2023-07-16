package com.kliachenko.dictionaryapp.feature_dictionary.data.database.entity

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.kliachenko.dictionaryapp.feature_dictionary.data.util.JsonParser
import com.kliachenko.dictionaryapp.feature_dictionary.domain.model.Meaning

@ProvidedTypeConverter
class Converters(
    private val jsonParser: JsonParser
) {

    @TypeConverter
    fun fromMeaningJson(json: String): List<Meaning>{
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: emptyList()
    }

    fun toMeaningJson(meaning: List<Meaning>): String {
        return jsonParser.toJson(
            meaning,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: "[]"
    }
}