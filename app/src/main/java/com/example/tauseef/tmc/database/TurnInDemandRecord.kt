package com.example.tauseef.tmc.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class TurnInDemandRecord {
    @PrimaryKey
    private val uid: Int = 0

    @ColumnInfo(name = "item_noun")
    private val itemNoun: String? = null
    @ColumnInfo(name = "item_part_number")
    private val itemPartNumber: String? = null
    @ColumnInfo(name = "turn_in_demand_date")
    private val turnInDemandDate: String? = null
    @ColumnInfo(name = "turn_in_demand_number")
    private val turnInDemandumber: String? = null
    @ColumnInfo(name = "received_by")
    private val receivedBy: String? = null

}