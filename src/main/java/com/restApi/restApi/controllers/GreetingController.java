package com.restApi.restApi.controllers;

import com.restApi.restApi.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";  //cria metodo de template
    private static final AtomicLong counter = new AtomicLong();  //cria classe para uso de counter

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Word") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
