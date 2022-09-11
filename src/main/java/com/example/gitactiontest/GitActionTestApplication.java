package com.example.gitactiontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionTestApplication {

    @GetMapping
    public String test(){
        return "ttt123123";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitActionTestApplication.class, args);
    }

}
