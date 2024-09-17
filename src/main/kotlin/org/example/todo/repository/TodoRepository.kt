package org.example.todo.repository

import org.example.todo.entity.Todos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : JpaRepository<Todos, Long>, JpaSpecificationExecutor<Todos> {
    fun findAllByFinishedFalse(): List<Todos>
}
