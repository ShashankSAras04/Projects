package com.springboot_bank.serviceimpl;

import com.springboot_bank.dto.SavingAccountDto;
import com.springboot_bank.entity.SavingsAccount;
import com.springboot_bank.exception.ResourceNotFoundException;
import com.springboot_bank.mapping.SavingAccountMapper;
import com.springboot_bank.repository.SavingsAccountRepository;
import com.springboot_bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {
    @Autowired
    private SavingsAccountRepository repository;

    @Override
    public SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto)
    {
        SavingsAccount savingAccount = SavingAccountMapper.mapToSavingAccount(savingAccountDto);
        SavingsAccount newSavingAccount =repository.save(savingAccount);
        return SavingAccountMapper.mapToSavingAccountDto(newSavingAccount);

    }

    @Override
    public SavingAccountDto getSavingAccount(Long id) {
        SavingsAccount savingsAccount = repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Savings Account id = "+id+" is not available"));
        return SavingAccountMapper.mapToSavingAccountDto(savingsAccount);
    }

    @Override
    public List<SavingAccountDto> getAllSavingAccount() {

        return repository.findAll().stream().map((savingAccount) -> SavingAccountMapper.mapToSavingAccountDto(savingAccount)).collect(Collectors.toList());
    }

    @Override
    public SavingAccountDto creditSavingAccount(Long id, double amount) {
        SavingsAccount savingAccount=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("the Saving Acccount id:"+id+"has not Found !!"));

        double totalAmount=savingAccount.getBalance()+amount;
        savingAccount.setBalance(totalAmount);

        SavingsAccount newSavingAccount=repository.save(savingAccount);

        return SavingAccountMapper.mapToSavingAccountDto(newSavingAccount);
    }

    @Override
    public SavingAccountDto debitSavingAccount(Long id, double amount) {
        SavingsAccount savingAccount=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("The Saving Account id:"+id+"has not Found !!"));
        if(savingAccount.getBalance()<amount)
        {
            throw new RuntimeException("Insuffient Account Balance in your Account !!!!");

        }
        double totalAmonunt=savingAccount.getBalance()-amount;
        savingAccount.setBalance(totalAmonunt);

        SavingsAccount newSavingAccount=repository.save(savingAccount);
        return SavingAccountMapper.mapToSavingAccountDto(newSavingAccount);
    }

    @Override
    public void deleteSavingAccount(Long id) {
        repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("The Saving Account id :"+id+" has not Found !!"));
        repository.deleteById(id);

    }


}
