package com.nseit.springTodoData;

import com.nseit.springTodoData.model.Todo;
import com.nseit.springTodoData.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTodoDataApplication implements CommandLineRunner {
	@Autowired
	private TodoService todoService;

	public static void main(String[] args) {

		SpringApplication.run(SpringTodoDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Todo todo = new Todo(1,"Harsha",21,"harsha@gmail.com");
		Todo todo1 = new Todo(2,"Arun",19,"arun@gmail.com");
		Todo todo2 = new Todo(3,"Siva",13,"siva@gmail.com");
		Todo todo3 = new Todo(4,"Dinesh",15,"dinesh@gmail.com");
		Todo todo4 = new Todo(5,"Mani",22,"Mani@gmail.com");
		todoService.add(todo);
		todoService.add(todo1);
		todoService.add(todo2);
		todoService.add(todo3);
		todoService.add(todo4);

		todoService.view();

		todoService.update(1);

		todoService.remove(2);

		todoService.view();


	}
}
