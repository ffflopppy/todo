package org.example.todo.service

import org.example.todo.entity.Todos
import org.example.todo.repository.TodoRepository
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class TodoServiceTest {

    @Autowired
    lateinit var todoService: TodoService

    @Autowired
    lateinit var todoRepository: TodoRepository

    @BeforeEach
    fun setUp() {
        todoRepository.save(Todos(title = "Test Task 1", finished = false))
        todoRepository.save(Todos(title = "Test Task 2", finished = true))
    }

    @AfterEach
    fun tearDown() {
        todoRepository.deleteAll()
    }

    @Test
    fun `test getAllTodo`() {
        val todos = todoService.getAllTodo()
        assert(todos.isNotEmpty())
    }
}
