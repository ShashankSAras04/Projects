package com.demo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api12")
public class MonthPath {

    @GetMapping("/month-name/{monthNumber}")
    public String getMonthName(@PathVariable int monthNumber) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            return "Month: " + months[monthNumber - 1];
        } else {
            return "Invalid month number. Please enter a value from 1 to 12.";
        }
    }
}
