package com.example.MicroService2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Controller.
 */
@RestController
@RequestMapping("/microservice2")
public class Controller {

    /**
     * Test string.
     *
     * @return the string
     */
    @GetMapping("/message")
    public String test() {
        return "This is second microservice";
    }
}
