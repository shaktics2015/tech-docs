package org.opensourceutils.client;

import org.opensourceutils.model.TodoModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JsonFeignClientFallback implements JsonFeignClient {

    @Override
    public List<TodoModel> getTodos() {
        List<TodoModel> listResponse = new ArrayList<>();
        listResponse.add(TodoModel.builder()
                .userId("usr_1")
                .id(1)
                .title("George All")
                .completed(true)
                .build());
        return listResponse;
    }

    @Override
    public TodoModel getTodoById(int id) {
        return TodoModel.builder()
                .userId("usr_1")
                .id(id)
                .title("George 1")
                .completed(true)
                .build();
    }
}