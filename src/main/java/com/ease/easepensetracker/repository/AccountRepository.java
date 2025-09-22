package com.ease.easepensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ease.easepensetracker.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    /*
     * Common JpaRepository methods (already available, no need to implement):
     * 
     * <S extends Account> S save(S entity); // Save or update an entity
     * 
     * <S extends Account> List<S> saveAll(Iterable<S> entities); // Save multiple entities
     * 
     * Optional<Account> findById(String id); // Find by primary key (id)
     *
     * boolean existsById(String id); // Check if an entity exists by id
     *
     * List<Account> findAll(); // Retrieve all accounts
     *
     * List<Account> findAllById(Iterable<String> ids); // Retrieve all by a list of ids
     *
     * long count(); // Count total accounts
     *
     * void deleteById(String id); // Delete by primary key
     *
     * void delete(Account entity); // Delete an account entity
     *
     * void deleteAll(); // Delete all accounts
     *
     * You can also define custom queries just by naming convention:
     * e.g., List<Account> findByName(String name); 
     */
}
