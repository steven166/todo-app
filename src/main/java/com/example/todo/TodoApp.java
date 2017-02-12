package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Awesome todo app
 * @author Steven Hermans
 */
@SpringBootApplication
public class TodoApp {

    public static void main(String[] args){
        SpringApplication.run(TodoApp.class, args);
    }



}
