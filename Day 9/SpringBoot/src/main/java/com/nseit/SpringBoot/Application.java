package com.nseit.SpringBoot;

import com.nseit.SpringBoot.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nseit.SpringBoot.service.TodoService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private TodoService todoService;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
		@Override
		public void run (String...args) throws Exception {
			Todo todo1 = new Todo(1, "abc", false);
			Todo todo2 = new Todo(2, "har", false);
			Todo todo3 = new Todo(3, "nar", false);
			todoService.add(todo1);
			todoService.add(todo2);
			todoService.add(todo3);

			todoService.view();

			todoService.update(1);
			todoService.remove(2);
			todoService.view();

		}
	}

