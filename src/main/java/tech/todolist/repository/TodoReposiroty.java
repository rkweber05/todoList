package tech.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.todolist.entity.Todo;

public interface TodoReposiroty extends JpaRepository<Todo, Long> {
}
