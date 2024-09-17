package org.example.todo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Todos(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?= null,
    val title: String,
    val finished: Boolean
)
