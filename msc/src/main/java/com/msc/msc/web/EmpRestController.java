package com.msc.msc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Emp")
public class EmpRestController {


    @GetMapping("/hi")
    public String sayHello() {
        return "hi World";
    }
}
