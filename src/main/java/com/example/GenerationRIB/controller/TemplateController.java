package com.example.GenerationRIB.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TemplateController {

    @PostMapping("/data")
    public void postData(){
        System.out.println("post json data ");

    }

}
