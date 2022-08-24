package com.nseit.SpringBoot.TodoRes;

import lombok.Getter;
import com.nseit.SpringBoot.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository
public class TodoRes {
    ArrayList<Todo> todos = new ArrayList<>();
}

