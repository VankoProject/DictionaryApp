package com.kliachenko.dictionaryapp.feature_dictionary.data.network.dto

data class PhoneticDto(
    val audio: String,
    val sourceUrl: String,
    val text: String
)