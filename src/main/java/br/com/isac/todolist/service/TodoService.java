package br.com.isac.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.isac.todolist.entity.Todo;
import br.com.isac.todolist.repository.TodoRepository;
import br.com.isac.todolist.exception.BadRequestException;

@Service
public class TodoService {
	private TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public List<Todo> list() {
		Sort sort = Sort.by(Direction.DESC,"priodidade").and(Sort.by(Direction.ASC, "id"));
		return todoRepository.findAll(sort);
	}
	
	public List<Todo> create(Todo todo) {
		todoRepository.save(todo);
		return list();
	}
	
	public List<Todo> update(long id, Todo todo) {
		todoRepository.findById(id).ifPresentOrElse((existingTodo) -> {
			todo.setId(id);
			todoRepository.save(todo);
		}, () -> {
			throw new BadRequestException("Todo %d não existe!".formatted(id));
		});
		return list();
	}
	
	public List<Todo> delete(Long id) {
		todoRepository.findById(id).ifPresentOrElse((existingTodo) -> todoRepository.delete(existingTodo), () -> {
			throw new BadRequestException("Todo %d não existe!".formatted(id));
		});
		return list();
	}
}
