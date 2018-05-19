package com.example.tauseef.tmc.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class LeaveRecord {
    @PrimaryKey
    private val uid: Int = 0

    @ColumnInfo(name = "pak")
    private val pak: String? = null
    @ColumnInfo(name = "from_date")
    private val fromDate: String? = null
    @ColumnInfo(name = "to_date")
    private val toDate: String? = null
    @ColumnInfo(name = "type_of_leave")
    private val typeOfLeave: String? = null
    @ColumnInfo(name = "total_days")
    private val totalDays: String? = null
}