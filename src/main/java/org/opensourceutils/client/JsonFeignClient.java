package org.opensourceutils.client;

import org.opensourceutils.config.FeignClientConfig;
import org.opensourceutils.model.TodoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "feignClient",
    url = "${client.api.url}",
        configuration = FeignClientConfig.class,
        fallback = JsonFeignClientFallback.class)
public interface JsonFeignClient {

    @GetMapping(value="/todos",consumes= MediaType.APPLICATION_JSON_VALUE)
    List<TodoModel> getTodos();

    @GetMapping("/todos/{id}")
    TodoModel getTodoById(@PathVariable("id") int id);

}