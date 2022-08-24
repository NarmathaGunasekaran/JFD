package com.nseit.SpringBoot.service;

import com.nseit.SpringBoot.TodoRes.TodoRes;
import com.nseit.SpringBoot.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    @Autowired
    private TodoRes todoRes;

    public void add(Todo todo) {
        ArrayList<Todo> todos = todoRes.getTodos();
        todos.add(todo);
    }

    public void view() {
        for (Todo todo : todoRes.getTodos()) {
            System.out.println(todo.getId() + "." + todo.getItemName() + " " + todo.isComplete());
        }
    }

    public void update(int id) {
        for (Todo todo1 : todoRes.getTodos()) {
            if (id == todo1.getId()) {
                todo1.setComplete(true);
                break;
            }
        }
    }

    public void remove(int id) {
        for (Todo todo1 : todoRes.getTodos()) {
            if (id == todo1.getId()) {
                todoRes.getTodos().remove(todo1);


            }
        }
    }
}