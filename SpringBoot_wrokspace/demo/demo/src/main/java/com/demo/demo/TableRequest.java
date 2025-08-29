package com.demo.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api3")
public class TableRequest {

    @GetMapping("/table")
    public List<String> getMultiplicationTable(@RequestParam int number) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(number + " x " + i + " = " + (number * i));
        }
        return table;
    }
}
