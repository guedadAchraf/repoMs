package com.msb.msb.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiEmp")
public class EmployeeRestController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

}
