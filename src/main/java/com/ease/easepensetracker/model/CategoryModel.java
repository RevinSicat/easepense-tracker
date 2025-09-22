package com.ease.easepensetracker.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CategoryModel {
    @Id
    String id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String type;

    public CategoryModel() {
        this.id = UUID.randomUUID().toString().split("-")[0];
    }
}
