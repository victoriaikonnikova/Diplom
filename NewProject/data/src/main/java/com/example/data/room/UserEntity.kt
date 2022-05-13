package com.example.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_entity_table")
data class UserEntity(
    var firstName: String,
    var secondName: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}