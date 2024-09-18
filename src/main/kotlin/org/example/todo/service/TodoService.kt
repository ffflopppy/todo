package org.example.todo.service

import org.example.todo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepo: TodoRepository
) {
    fun getAllTodo() = todoRepo.findAllByFinishedFalse()
}
