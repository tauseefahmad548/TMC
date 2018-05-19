package com.example.tauseef.tmc.database

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query



@Dao
interface PersonnelDao {
    @get:Query("SELECT * FROM Personnel")
    val all: List<Personnel>

    @Query("SELECT * FROM Personnel WHERE uid IN (:PersonnelIds)")
    fun loadAllByIds(PersonnelIds: IntArray): List<Personnel>

    @Query("SELECT * FROM Personnel WHERE first_name LIKE :first AND " + "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Personnel

    @Insert
    fun insertAll(vararg Personnels: Personnel)

    @Delete
    fun delete(Personnel: Personnel)
}
