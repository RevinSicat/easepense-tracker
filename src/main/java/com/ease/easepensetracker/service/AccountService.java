package com.ease.easepensetracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ease.easepensetracker.model.Account;
import com.ease.easepensetracker.repository.AccountRepository;

import jakarta.transaction.Transactional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    @Transactional
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Transactional
    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    public Optional<Account> getAccountById(String id){
        return accountRepository.findById(id);
    }
}
