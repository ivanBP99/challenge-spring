package com.challenge.demo_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/say")
    public String saludo() {
        return "Hola a todos";
    }
}
