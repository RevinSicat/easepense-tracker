package com.ease.easepensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AccountModel {
    @Id
    String id;
    String name;
    private double balance;
}
