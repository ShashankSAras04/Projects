package com.springboot_bank.controller;


import com.springboot_bank.dto.SavingAccountDto;
import com.springboot_bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3030")
public class SavingAccountControler {
    @Autowired
    private SavingAccountService savingAccountService;

    @PostMapping("/accounts")
    public ResponseEntity<SavingAccountDto> createSavingAccount(@RequestBody SavingAccountDto savingAccountDto) {
        return new ResponseEntity<>(savingAccountService.createSavingAccount(savingAccountDto), HttpStatus.CREATED);

    }

    @GetMapping("/accounts/{id}")
    public  ResponseEntity<SavingAccountDto> getSavingsAccountById(@PathVariable Long id)
    {
        return new ResponseEntity<>(savingAccountService.getSavingAccount(id), HttpStatus.OK);
    }

    @GetMapping("/accounts")
    public  ResponseEntity<List<SavingAccountDto>> getAllSavingAccount()
    {
        return new ResponseEntity<>(savingAccountService.getAllSavingAccount(),HttpStatus.OK);
    }

    @PostMapping("/accounts/credit/{id}")
    public ResponseEntity<SavingAccountDto> creditSavingAccount(@PathVariable Long id, @RequestBody Map<String , Double> obj)
    {
        return new ResponseEntity<>(savingAccountService.creditSavingAccount(id, obj.get("amount")),HttpStatus.OK);
    }

    @PostMapping("/accounts/debit/{id}")
    public ResponseEntity<SavingAccountDto> debitSavingAccount(@PathVariable Long id, @RequestBody Map<String ,Double> obj)
    {
        return new ResponseEntity<>(savingAccountService.debitSavingAccount(id,obj.get("amount")),HttpStatus.OK);
    }

    @DeleteMapping("/accounts/{id}")
    public ResponseEntity<String> deleteSavingAccountById(@PathVariable Long id)
    {
        savingAccountService.deleteSavingAccount(id);
        return new ResponseEntity<>("The SavingAccount has id"+id+"has deleted successfully",HttpStatus.OK);
    }
}
