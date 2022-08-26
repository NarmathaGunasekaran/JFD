package com.nseit.springTodoData.Respiratory;

import com.nseit.springTodoData.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Getter
public class TodoRespiratory {
    ArrayList<Todo> todos = new ArrayList<>();
}
