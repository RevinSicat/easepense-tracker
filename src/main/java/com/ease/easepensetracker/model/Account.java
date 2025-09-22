package com.ease.easepensetracker.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @Column(updatable = false, nullable = false, unique = true)
    String id;

    @NotBlank
    @Column(nullable = false)
    String name;

    @PositiveOrZero
    @Column(nullable = false)
    private double balance;

    public Account() {
        this.id = UUID.randomUUID().toString();
    }
}
