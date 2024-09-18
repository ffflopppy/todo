package org.example.todo.controller

import org.example.todo.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val todoService: TodoService
) {
    @GetMapping("/")
    fun index() = "hello"

    @PostMapping("/")
    fun todo() = todoService.getAllTodo()
}
