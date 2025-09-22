package com.ease.easepensetracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ease.easepensetracker.model.Transaction;
import com.ease.easepensetracker.repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Transactional
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Transactional
    public Transaction updateTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Transactional
    public void deleteTransaction(String id) {
        transactionRepository.deleteById(id);
    }

    public Optional<Transaction> getTransactionById(String id) {
        return transactionRepository.findById(id);
    }

}
