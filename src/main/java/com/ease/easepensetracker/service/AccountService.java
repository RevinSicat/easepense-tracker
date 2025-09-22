package com.ease.easepensetracker.service;

import java.util.List;
import java.util.Optional;

import com.ease.easepensetracker.model.Account;
import com.ease.easepensetracker.repository.AccountRepository;

public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    public Optional<Account> getAccountById(String id){
        return accountRepository.findById(id);
    }
}
