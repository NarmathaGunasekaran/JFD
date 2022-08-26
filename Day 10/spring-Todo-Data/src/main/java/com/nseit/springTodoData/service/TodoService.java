package com.nseit.springTodoData.service;

import com.nseit.springTodoData.Respiratory.TodoRespiratory;
import com.nseit.springTodoData.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    @Autowired
    private TodoRespiratory todoRespiratory;

    public void add(Todo todo) {
        ArrayList<Todo> todos = todoRespiratory.getTodos();
        todos.add(todo);

    }

    public void view() {
        for (Todo todo : todoRespiratory.getTodos()) {
            System.out.println(todo.getId() + "." + todo.getName() +"."+ todo.getAge() +"."+ todo.getEmail());
        }

    }

    public void update(int id) {
        for (Todo todo : todoRespiratory.getTodos()) {
            if (id == todo.getId()) {
                todo.setName("Narmatha");
                break;
            }

        }
    }
        public void remove(int id) {
            for (Todo todo : todoRespiratory.getTodos()) {
                if (id == todo.getId()) {
                    todoRespiratory.getTodos().remove(todo);
                    break;
                }
            }

        }
    }

