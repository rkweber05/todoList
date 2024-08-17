package tech.todolist.service;

import org.springframework.stereotype.Service;
import tech.todolist.entity.Todo;
import tech.todolist.repository.TodoReposiroty;

import java.util.List;

@Service
public class TodoService {

    public TodoService(TodoReposiroty todoReposiroty) {
        this.todoReposiroty = todoReposiroty;
    }

    private final TodoReposiroty todoReposiroty;

    public List<Todo> create(){}

    public List<Todo> list(){}

    public List<Todo> update(){}

    public List<Todo> delete(){}

}
