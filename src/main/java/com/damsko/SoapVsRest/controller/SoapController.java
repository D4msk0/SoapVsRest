package com.damsko.SoapVsRest.controller;

import com.damsko.SoapVsRest.model.Greeting;
import com.damsko.SoapVsRest.service.SoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

public class SoapController {

    private static final String NAMESPACE_URI = "http://www.damsko.com/soapvsrest";

    @Autowired
    private SoapService soapService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGreetingRequest")
    @ResponsePayload
    public Greeting getGreeting() {
        String message = soapService.generateSoapGreeting("SOAP User");
        return new Greeting(message);
    }
}
