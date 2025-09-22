package com.ease.easepensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ease.easepensetracker.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    /*
    * Common JpaRepository methods (already available, no need to implement):
    *
    * <S extends Category> S save(S entity); // Save or update an entity
    *
    * <S extends Category> List<S> saveAll(Iterable<S> entities); // Save multiple entities
    *
    * Optional<Category> findById(String id); // Find by primary key (id)
    *
    * boolean existsById(String id); // Check if an entity exists by id
    *
    * List<Category> findAll(); // Retrieve all Category
    *
    * List<Category> findAllById(Iterable<String> ids); // Retrieve all by a list of ids
    *
    * long count(); // Count total Category
    *
    * void deleteById(String id); // Delete by primary key
    *
    * void delete(Category entity); // Delete an Category entity
    *
    * void deleteAll(); // Delete all Category
    *
    * You can also define custom queries just by naming convention:
    * e.g., List<Account> findByName(String name);
    */
}
