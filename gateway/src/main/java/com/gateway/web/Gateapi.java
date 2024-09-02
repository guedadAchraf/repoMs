package com.gateway.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Gateapi {


    @GetMapping("/salam")
    public String sayHello() {
        return "salam, World";
    }

}
