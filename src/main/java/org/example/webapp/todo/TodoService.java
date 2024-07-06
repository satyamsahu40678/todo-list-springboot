package org.example.webapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();

    private  static int counter = 1;
    static {
        todos.add(new Todo(counter++, "nerdy", "LearnAWSCertified1", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(counter++, "nerdy", "LearnDevOPS1", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(counter++, "nerdy", "LearnAzure1", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(counter++, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        //todo.getId() == id
        //todo -> todo.getId() == id
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        todos.removeIf(predicate);
        todos.removeIf(predicate -> predicate.getId() == id);
    }
    public Todo findById(int id) {

        Todo todo = todos.stream().filter(predicate -> predicate.getId() == id).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
