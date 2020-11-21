package com.rest.api.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String name() {
        return "hello World !. This is my first change ;)";
    }
}
