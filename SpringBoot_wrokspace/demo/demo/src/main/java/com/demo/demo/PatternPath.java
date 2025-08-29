package com.demo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api8")
public class PatternPath {

    @GetMapping(value = "/number-pattern/{rows}", produces = "text/plain")
    public String getNumberPattern(@PathVariable int rows) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                pattern.append(j).append(" ");
            }
            pattern.append("\n");
        }
        return pattern.toString();
    }
}
