package br.com.isac.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isac.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
