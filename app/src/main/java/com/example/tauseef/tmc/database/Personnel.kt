package com.example.tauseef.tmc.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Personnel {
    @PrimaryKey
    private val uid: Int = 0

    @ColumnInfo(name = "pak")
    private val pak: String? = null
    @ColumnInfo(name = "rank")
    private val rank: String? = null
    @ColumnInfo(name = "name")
    private val name: String? = null
    @ColumnInfo(name = "date_of_enrollment")
    private val dateOfEnrollment: String? = null
    @ColumnInfo(name = "date_posting_in")
    private val datePostingIn: String? = null
    @ColumnInfo(name = "date_of_birth")
    private val dateOfBirth: String? = null
    @ColumnInfo(name = "blood_group")
    private val bloodGroup: String? = null
    @ColumnInfo(name = "tma_due_date")
    private val tmaDueDate: String? = null

    @ColumnInfo(name = "temp_address")
    private val tempAdrress: String? = null
    @ColumnInfo(name = "perm_address")
    private val permAddress: String? = null
    @ColumnInfo(name = "phone_primary")
    private val phonePrimary: String? = null
    @ColumnInfo(name = "phone_secondary")
    private val phoneSecondary: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null
    @ColumnInfo(name = "last_name")
    private val lastName: String? = null

    // Getters and setters are ignored for brevity,
    // but they're required for Room to work.
}
