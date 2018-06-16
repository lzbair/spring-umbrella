package com.portal.selfcare.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to selfe care app";
    }

    @RequestMapping("/user/{id}")
    public String index(@PathVariable String id) {
        return "Welcome dude, your request is authorized because you're acting on behalf of: " + id;
    }


}