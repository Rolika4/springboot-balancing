package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    @GetMapping(value = "/api/hello")
    public String hello() {
        String hostname = Optional.ofNullable(System.getenv("HOSTNAME")).orElse("unknown");
        return "Response received from pod: " + hostname;
    }
}
