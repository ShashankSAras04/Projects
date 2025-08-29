package com.demo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api9")
public class PatternRequest {

    @GetMapping(value = "/number-pattern", produces = "text/plain")
    public String getNumberPattern(@RequestParam int rows) {
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
