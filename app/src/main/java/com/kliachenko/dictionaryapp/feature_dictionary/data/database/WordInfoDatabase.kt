package com.kliachenko.dictionaryapp.feature_dictionary.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kliachenko.dictionaryapp.feature_dictionary.data.database.entity.Converters
import com.kliachenko.dictionaryapp.feature_dictionary.data.database.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase: RoomDatabase() {

    abstract fun dao(): WordInfoDao
}