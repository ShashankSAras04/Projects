package com.demo.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api2")
public class TablePath {

    @GetMapping("/table/{number}")
    public List<String> getMultiplicationTable(@PathVariable int number) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(number + " x " + i + " = " + (number * i));
        }
        return table;
    }
}
