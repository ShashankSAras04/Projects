package com.demo.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api1")
public class PrimeRequest {

    @GetMapping("/primes")
    public List<Integer> getPrimes1(@RequestParam int start, @RequestParam int end) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }


    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
