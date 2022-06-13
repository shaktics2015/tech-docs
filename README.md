# tech-docs






### Circuit breaker

http://localhost:8080/actuator/circuitbreakerevents/lookupTodos/STATE_TRANSITION

```
{
 "circuitBreakerEvents": [
    {
        "circuitBreakerName": "lookupTodos",
        "type": "STATE_TRANSITION",
        "creationTime": "2022-06-13T19:47:10.423073+05:30[Asia/Kolkata]",
        "errorMessage": null,
        "durationInMs": null,
        "stateTransition": "CLOSED_TO_OPEN"
    },
    {
        "circuitBreakerName": "lookupTodos",
        "type": "STATE_TRANSITION",
        "creationTime": "2022-06-13T19:47:48.811099+05:30[Asia/Kolkata]",
        "errorMessage": null,
        "durationInMs": null,
        "stateTransition": "OPEN_TO_HALF_OPEN"
    },
    {
        "circuitBreakerName": "lookupTodos",
        "type": "STATE_TRANSITION",
        "creationTime": "2022-06-13T19:48:30.683279+05:30[Asia/Kolkata]",
        "errorMessage": null,
        "durationInMs": null,
        "stateTransition": "HALF_OPEN_TO_OPEN"
    }
    ]
}
```


http://localhost:8080/actuator/circuitbreakerevents


```
{
   "circuitBreakerEvents":[
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:38:30.614599+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":1173,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"SUCCESS",
         "creationTime":"2022-06-13T19:44:38.588450+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":590,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:04.790789+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":708,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:05.867229+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":332,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:06.563266+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":330,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:07.341106+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":327,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:08.178367+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":389,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:08.959144+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":352,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:09.711033+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":335,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:10.401769+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":330,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"FAILURE_RATE_EXCEEDED",
         "creationTime":"2022-06-13T19:47:10.404322+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"STATE_TRANSITION",
         "creationTime":"2022-06-13T19:47:10.423073+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":"CLOSED_TO_OPEN"
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"NOT_PERMITTED",
         "creationTime":"2022-06-13T19:47:10.870099+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"NOT_PERMITTED",
         "creationTime":"2022-06-13T19:47:11.658386+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"NOT_PERMITTED",
         "creationTime":"2022-06-13T19:47:12.342857+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"STATE_TRANSITION",
         "creationTime":"2022-06-13T19:47:48.811099+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":"OPEN_TO_HALF_OPEN"
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"ERROR",
         "creationTime":"2022-06-13T19:47:49.487705+05:30[Asia/Kolkata]",
         "errorMessage":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://jsonplaceholder.typicode.com/todos/0] [JsonFeignClient#getTodoById(int)]: [{}]",
         "durationInMs":676,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"SUCCESS",
         "creationTime":"2022-06-13T19:48:19.975316+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":523,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"SUCCESS",
         "creationTime":"2022-06-13T19:48:28.066463+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":512,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"SUCCESS",
         "creationTime":"2022-06-13T19:48:30.156110+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":173,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"SUCCESS",
         "creationTime":"2022-06-13T19:48:30.682897+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":168,
         "stateTransition":null
      },
      {
         "circuitBreakerName":"lookupTodos",
         "type":"STATE_TRANSITION",
         "creationTime":"2022-06-13T19:48:30.683279+05:30[Asia/Kolkata]",
         "errorMessage":null,
         "durationInMs":null,
         "stateTransition":"HALF_OPEN_TO_OPEN"
      }
   ]
}
```

Other useful params can be found on http://localhost:8080/actuator/metrics
