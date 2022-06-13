package org.opensourceutils.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.opensourceutils.model.TodoModel;
import org.opensourceutils.service.JsonService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/json")
@Slf4j
public class JsonController {

    private final JsonService service;

    @GetMapping("/todos")
    List<TodoModel> getTodos(){
        return service.getTodos();
    }

   TodoModel lookupTodosFallback( int id, final HttpClientErrorException e){
       log.debug("Todo lookup request resulted in a client exception with status {}", e.getStatusCode());
       return TodoModel.builder().build();
    }

    @GetMapping("/todo/{id}")
    @CircuitBreaker(name = "lookupTodos", fallbackMethod = "lookupTodosFallback")
    TodoModel getTodo(@PathVariable("id") int id){
        return service.getTodo(id);
    }

}