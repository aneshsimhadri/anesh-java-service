package com.anesh.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/v1")
public class TestController {

    @GetMapping(path = "/getAllDetails")
    public String getAllDetails(){
        return "Thank you for calling v1 getAllDetails";
    }
}
