package com.ease.easepensetracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ease.easepensetracker.model.Transaction;
import com.ease.easepensetracker.repository.TransactionRepository;

import jakarta.persistence.EntityNotFoundException;

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

    @Transactional(readOnly = true)
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Transactional
    public Transaction updateTransaction(Transaction transaction) {
        if (!transactionRepository.existsById(transaction.getId())) {
            throw new EntityNotFoundException("Transaction not found with id " + transaction.getId());
        }
        return transactionRepository.save(transaction);
    }

    @Transactional
    public void deleteTransaction(String id) {
        transactionRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Transaction> getTransactionById(String id) {
        return transactionRepository.findById(id);
    }

}
