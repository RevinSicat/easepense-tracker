package com.ease.easepensetracker.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    @Column(updatable = false, nullable = false, unique = true)
    String id;

    @NotBlank
    @Column(nullable = false)
    String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryType type;

    public Category(String id, String name, CategoryType type) {
        this.id = (id != null) ? id : UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
    }

}
