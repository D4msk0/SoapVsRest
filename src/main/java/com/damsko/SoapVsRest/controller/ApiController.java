package com.damsko.SoapVsRest.controller;

import com.damsko.SoapVsRest.model.Greeting;
import com.damsko.SoapVsRest.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/api/greet/{name}")
    public Greeting greet(@PathVariable String name){
        String message = greetingService.generateGreeting(name);
        return new Greeting(message);
    }
}
