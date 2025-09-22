package com.ease.easepensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ease.easepensetracker.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {
    /*
    * Common JpaRepository methods (already available, no need to implement):
    *
    * <S extends Transaction> S save(S entity); // Save or update an entity
    *
    * <S extends Transaction> List<S> saveAll(Iterable<S> entities); // Save multiple entities
    *
    * Optional<Transaction> findById(String id); // Find by primary key (id)
    *
    * boolean existsById(String id); // Check if an entity exists by id
    *
    * List<Transaction> findAll(); // Retrieve all Transaction
    *
    * List<Transaction> findAllById(Iterable<String> ids); // Retrieve all by a list of ids
    *
    * long count(); // Count total Transaction
    *
    * void deleteById(String id); // Delete by primary key
    *
    * void delete(Transaction entity); // Delete an account entity
    *
    * void deleteAll(); // Delete all Transaction
    *
    * You can also define custom queries just by naming convention:
    * e.g., List<Account> findByName(String name);
    */
}
