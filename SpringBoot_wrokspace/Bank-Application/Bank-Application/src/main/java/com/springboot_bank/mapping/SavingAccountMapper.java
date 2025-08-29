package com.springboot_bank.mapping;

import com.springboot_bank.dto.SavingAccountDto;
import com.springboot_bank.entity.SavingsAccount;

public class SavingAccountMapper {
    public static SavingAccountDto mapToSavingAccountDto(SavingsAccount savingsAccount)
    {
        SavingAccountDto savingAccountDto = new SavingAccountDto(
                savingsAccount.getId(),
                savingsAccount.getAccountHolderName(),
                savingsAccount.getBalance(),
                savingsAccount.getCreatedDate(),
                savingsAccount.getModifiedDate()
        );
        return savingAccountDto;
    }


    public static SavingsAccount mapToSavingAccount(SavingAccountDto savingAccountDto)
    {
        SavingsAccount savingAccount = new SavingsAccount(
                savingAccountDto.getId(),
                savingAccountDto.getAccountHolderName(),
                savingAccountDto.getBalance(),
                savingAccountDto.getCreatedDate(),
                savingAccountDto.getModifiedDate()
        );
        return savingAccount;
    }
}
