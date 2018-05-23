package com.example.tauseef.tmc.database

import android.arch.persistence.room.Entity

@Entity
class CurrentShiftsRecord {
     val pak: String? = null
     val rank: String? = null
     val name: String? = null
     val shift: ShiftsEnum? = null
}