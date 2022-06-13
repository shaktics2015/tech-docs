package org.opensourceutils.service;

import lombok.RequiredArgsConstructor;
import org.opensourceutils.client.JsonFeignClient;
import org.opensourceutils.model.TodoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JsonService {
    private final JsonFeignClient jsonFeignClient;

    public TodoModel getTodo(int id) {
        return jsonFeignClient.getTodoById(id);
    }
    public List<TodoModel> getTodos() {
        return jsonFeignClient.getTodos();
    }
}