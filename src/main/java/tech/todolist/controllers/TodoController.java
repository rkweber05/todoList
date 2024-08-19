package tech.todolist.controllers;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import tech.todolist.entity.Todo;
import tech.todolist.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list(){
        return  todoService.list();
    }

    @PutMapping("/{id}")
    List<Todo> update(@RequestBody Todo todo, @PathVariable("id") Long id){
        return todoService.update(todo);
    }

    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
