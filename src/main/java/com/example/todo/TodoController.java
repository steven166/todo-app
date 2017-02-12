package com.example.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Steven Hermans
 */
@RestController
public class TodoController{

    /**
     * Get things that should be done
     * @return done
     */
    @RequestMapping(path = "/api/v1/todos", method = RequestMethod.GET)
    public String todo(){
        return "done";
    }

}
