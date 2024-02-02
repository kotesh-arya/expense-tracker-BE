package com.expensetracker.restdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExpenseDetails {
    @Id
    private int id;
    private float amount;
}
