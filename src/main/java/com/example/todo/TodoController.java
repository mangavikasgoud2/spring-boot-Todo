/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.todo;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class TodoController{
    TodoService todoService = new TodoService();

    @GetMapping("/todos")
    public ArrayList<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable int id){
        return todoService.getTodo(id);
    }

    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @PutMapping("/todos/{id}")
    public Todo updateTodo(@PathVariable int id, @RequestBody Todo todo){
        return todoService.updateTodo(id,todo);
    }


    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
    }
}