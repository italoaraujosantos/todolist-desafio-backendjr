package br.com.isac.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.isac.todolist.entity.Todo;

public class TestConstants {
	
	public static final List<Todo> TODOS = new ArrayList<>() {
		{
			add(new Todo(9995L, "@italoaraujosantos", "Curtir", false, 1));
			add(new Todo(9996L, "@italoaraujosantos", "Comentar", false, 1));
			add(new Todo(9997L, "@italoaraujosantos", "Compartilhar", false, 1));
			add(new Todo(9998L, "@italoaraujosantos", "Se Inscrever", false, 1));
			add(new Todo(9999L, "italoaraujosantos", "Ativar as Notificações", false, 1));
		}
	};
	
	public static final Todo TODO = TODOS.get(0);

}
