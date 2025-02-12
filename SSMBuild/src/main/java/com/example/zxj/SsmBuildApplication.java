package com.example.zxj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SsmBuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmBuildApplication.class, args);
    }

    @GetMapping("/")
    public String getHi(){
        return "Hi";
    }

}
