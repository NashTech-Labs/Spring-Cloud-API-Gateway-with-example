package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type First mirco service controller.
 */
@RestController
@RequestMapping("/microservice1")
public class FirstMicroServiceController {
    /**
     * Test string.
     *
     * @return the string
     */
    @GetMapping("/message")
    public String test() {
        return "This is first microservice";
    }
}
