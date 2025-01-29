package br.com.isac.todolist.exception;

public class BadRequestException extends RuntimeException {
	
	public BadRequestException(String message) {
		super(message);
	}

}
