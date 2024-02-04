package com.damsko.SoapVsRest.service;

import org.springframework.stereotype.Service;

@Service
public class SoapService {

    public String generateSoapGreeting(String name){
        return "Hello from SOAP, " + name + "!";
    }
}
