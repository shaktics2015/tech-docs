package org.opensourceutils.controller;

import lombok.RequiredArgsConstructor;
import org.opensourceutils.model.TodoModel;
import org.opensourceutils.service.JsonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/json")
public class JsonController {

    private final JsonService service;


    @GetMapping("/todos")
    List<TodoModel> getTodos(){
        return service.getTodos();
    }

    @GetMapping("/todo/{id}")
    TodoModel getTodo(@PathVariable("id") int id){
        return service.getTodo(id);
    }

}