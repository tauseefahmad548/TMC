package com.example.tauseef.tmc.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = { Personnel.class }, version = 1)
abstract class MainDataBase : RoomDatabase() {
    abstract fun PersonnelDao(): PersonnelDao
}
