package com.kliachenko.dictionaryapp.feature_dictionary.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kliachenko.dictionaryapp.feature_dictionary.data.database.entity.WordInfoEntity

@Dao
interface WordInfoDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfos(infos: List<WordInfoEntity>)

    @Query ("DELETE FROM wordinfoentity WHERE word IN(:words)")
    suspend fun deleteWordInfos(words: List<String>)

    @Query ("SELECT * FROM wordinfoentity WHERE word LIKE '%' || :word || '%'")
    suspend fun getWordInfos (word: String): List<WordInfoEntity>


}