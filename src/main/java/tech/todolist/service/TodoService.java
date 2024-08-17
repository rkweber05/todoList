package tech.todolist.service;

import org.springframework.data.domain.Sort;
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

    public List<Todo> create(Todo todo){
        todoReposiroty.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending()
                .and(
                Sort.by("nome").ascending()
                    );
        return todoReposiroty.findAll();
    }

    public List<Todo> update(Todo todo){
        todoReposiroty.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        todoReposiroty.deleteById(id);
        return list();
    }

}
