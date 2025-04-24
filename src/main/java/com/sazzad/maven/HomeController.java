package com.sazzad.maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "/hello")
    public String printHello(){
        return "Hello Sazzad !";
    }
}
