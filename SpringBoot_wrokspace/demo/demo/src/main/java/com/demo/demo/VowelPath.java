package com.demo.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api10")
public class VowelPath {

    @GetMapping("/check-vowel/{ch}")
    public String checkVowel(@PathVariable char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return ch + " is a Vowel.";
        } else if (Character.isLetter(ch)) {
            return ch + " is a Consonant.";
        } else {
            return ch + " is not a valid alphabet character.";
        }
    }
}