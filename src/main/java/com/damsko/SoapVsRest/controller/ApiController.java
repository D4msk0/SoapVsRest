package com.damsko.SoapVsRest.controller;


import com.damsko.SoapVsRest.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/greeting")
    public Greeting getRestGreeting(){
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello from REST!");
        return greeting;
    }
}