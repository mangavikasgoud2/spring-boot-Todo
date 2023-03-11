package com.example.todo;
import java.util.*;
import com.example.todo.*;

public interface TodoRepository{
    ArrayList<Todo> getAllTodos();
    Todo getTodo(int id);
    Todo addTodo(Todo todo);
    Todo updateTodo(int id, Todo todo);
    void deleteTodo(int id);
}