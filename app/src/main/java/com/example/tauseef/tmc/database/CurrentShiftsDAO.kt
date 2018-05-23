package com.example.tauseef.tmc.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

@Dao
interface CurrentShiftsDAO {
    @Query("SELECT * FROM CurrentShiftsRecord WHERE shift = :shiftName")
    fun loadAllByShift(shiftName: ShiftsEnum): List<CurrentShiftsRecord>

    @Query("SELECT * FROM CurrentShiftsRecord WHERE shift = null")
    fun loadAllWithNoShift(): List<CurrentShiftsRecord>

    @Update
    fun updateShiftFor(shiftRecord: CurrentShiftsRecord)
}