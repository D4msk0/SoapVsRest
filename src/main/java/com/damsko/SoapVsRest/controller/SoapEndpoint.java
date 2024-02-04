package com.damsko.SoapVsRest.controller;

import com.damsko.SoapVsRest.model.Greeting;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SoapEndpoint {

    private static final String NAMESPACE_URI = "http://www.damsko.com/soapvsrest";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGreetingRequest")
    @ResponsePayload
    public Greeting getSoapGreeting() {
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello from SOAP!");
        return greeting;
    }
}
