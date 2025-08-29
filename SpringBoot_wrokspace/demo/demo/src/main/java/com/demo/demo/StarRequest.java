package com.demo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api7")
public class StarRequest {

    @GetMapping(value = "/Star", produces = "text/plain")
    public String getTriangle(@RequestParam int rows) {
        StringBuilder Star = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            Star.append("*".repeat(i)).append("\n");
        }
        return Star.toString();
    }
}
