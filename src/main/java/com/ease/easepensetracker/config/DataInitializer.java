package com.ease.easepensetracker.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ease.easepensetracker.model.Account;
import com.ease.easepensetracker.model.Category;
import com.ease.easepensetracker.model.CategoryType;
import com.ease.easepensetracker.repository.AccountRepository;
import com.ease.easepensetracker.repository.CategoryRepository;

import java.util.UUID;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(AccountRepository accountRepository, CategoryRepository categoryRepository) {
        return args -> {
            if (accountRepository.count() == 0) {
                System.out.println("[Notice]: No Accounts found.");
                System.out.println("[Started]: Creating Default Accounts");
                accountRepository.save(new Account(UUID.randomUUID().toString(), "Cash", 1000.0));
                accountRepository.save(new Account(UUID.randomUUID().toString(), "Bank", 5000.0));
                accountRepository.save(new Account(UUID.randomUUID().toString(), "Credit Card", -2000.0));
                System.out.println("[Ended]: Creating Default Accounts");
            }

            if (categoryRepository.count() == 0) {
                System.out.println("[Notice]: No Category found.");
                System.out.println("[Started]: Creating Default Categories");
                categoryRepository.save(new Category(UUID.randomUUID().toString(), "Food", CategoryType.EXPENSE));
                categoryRepository.save(new Category(UUID.randomUUID().toString(), "Salary", CategoryType.INCOME));
                categoryRepository.save(new Category(UUID.randomUUID().toString(), "Transport", CategoryType.EXPENSE));
                categoryRepository.save(new Category(UUID.randomUUID().toString(), "Entertainment", CategoryType.EXPENSE));
                categoryRepository.save(new Category(UUID.randomUUID().toString(), "Utilities", CategoryType.EXPENSE));
                categoryRepository.save(new Category(UUID.randomUUID().toString(), "Freelance", CategoryType.INCOME));
                System.out.println("[Ended]: Creating Default Categories");
            }
        };
    }
}
