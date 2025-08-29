package com.demo.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api4")
public class DivisiblePath{

    @GetMapping("/divisibleby/{divisor}")
    public List<Integer> getDivisibleNumbers(@PathVariable int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int i = 100; i >= 1; i--) {
            if (i % divisor == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
