package ro.uvt.sabloane.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping("/")
    public String getHelloData(){
        return "Hello from Spring Boot!";
    }
    @GetMapping("/error")
    public String error(){
        return "Error from HelloController!";
    }
}