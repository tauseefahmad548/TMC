package com.example.tauseef.tmc.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = arrayOf(Personnel::class,LeaveRecord::class,TurnInDemandRecord::class, CurrentShiftsRecord::class), version = 1)
abstract class MainDataBase : RoomDatabase() {
    abstract fun personnelDao(): PersonnelDao
    abstract fun currentShiftsDAO(): CurrentShiftsDAO
}
