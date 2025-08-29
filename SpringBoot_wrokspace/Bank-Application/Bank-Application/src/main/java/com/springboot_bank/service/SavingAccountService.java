package com.springboot_bank.service;

import com.springboot_bank.dto.SavingAccountDto;

import java.util.List;

public interface SavingAccountService {

    SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto);

    SavingAccountDto getSavingAccount(Long id);

    List<SavingAccountDto> getAllSavingAccount();

    SavingAccountDto creditSavingAccount(Long id ,double amount);

    SavingAccountDto debitSavingAccount(Long id ,double amount);

    void deleteSavingAccount(Long id);
}
