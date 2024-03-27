package com.employee.tracking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackingEmployeeController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Tracking Employee. How are you?";
    }

}
