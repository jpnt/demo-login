package com.jpnt.demologin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EndpointController {

    @GetMapping("/login")
    public String loginEndpoint() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboardEndpoint() {
        return "dashboard";
    }

    @GetMapping("/")
    public String homeEndpoint() {
        return "home";
    }

    @GetMapping("/register")
    public String registerEndpoint() {
        return "register";
    }

}
