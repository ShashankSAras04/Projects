package com.demo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api6")
public class StarPath {

    @GetMapping(value = "/Star/{rows}", produces = "text/plain")
    public String getTriangle(@PathVariable int rows) {
        StringBuilder Star = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            Star.append("*".repeat(i)).append("\n");
        }
        return Star.toString();
    }
}
