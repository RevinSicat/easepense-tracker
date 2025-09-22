package com.ease.easepensetracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Transaction {
    @Id
    @Column(updatable = false, nullable = false, unique = true)
    private String id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryModel category;

    @Column(nullable = false) 
    private String title; //default to Category name if not use format <categoryname>: <title>

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date date = new Date();

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false) 
    private String type; // default to category type

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private AccountModel account;

    private String notes; // can be null

    public Transaction() {
        this.id = UUID.randomUUID().toString();
    }
}
