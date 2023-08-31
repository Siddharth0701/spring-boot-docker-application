package com.singh.springbootdockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/")
    public String dockerDemo(){
        return  "Dockering Spring boot Application";

    }


}
